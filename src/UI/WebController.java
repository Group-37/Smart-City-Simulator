package UI;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import Database_Controller.CRUD;
import FileReadWrite.CSFile;
import FileReadWrite.DBFile;
import FileReadWrite.IFile;
import Main_Controller.StructureDatabaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/SmartCitySimulator")
public class WebController {
	
	Main_Controller.Controller controller;
	
	@Autowired
    private SimpMessagingTemplate template;
	
	@Autowired
	private StructureDatabaseRepository repository;
	
	@RequestMapping("/index")
	public String run()
	{
		return "index";
	}
	
	@RequestMapping(value="/continue" ,method = RequestMethod.POST)
	@ResponseBody
	public String display(@RequestBody String response)
	{
		response = response.replace("%2C", ",");
		response = response.replace("%5C", "/");
		response = response.replace("%2F", "/");
		response = response.replaceAll("=", "");
		String [] splitByComma = response.split(",");
		controller = new Main_Controller.Controller(splitByComma[1], splitByComma[0]);
		controller.cityDetails();
		if (!controller.getDetails().isEmpty())
			template.convertAndSend("/results", "Success:" + controller.getDetails());
		else
			template.convertAndSend("/results", "There has been an error parsing the file:\nPlease check the filepath is real or the file type is correct.");
		//template.convertAndSend("/topic/results", controller.getResults());
		return "";
	}
	
	@RequestMapping(value="/results" , method = RequestMethod.POST)
	public String results()
	{
		controller.cityResults();
		template.convertAndSend("/results", controller.getResults());
		return "";
	}
	
	@RequestMapping("saveAll")
	@ResponseBody
	public String saveAll()
	{
		IFile fileReaderWriter = new DBFile();
		fileReaderWriter.get("src/Resources/map.txt");
		CRUD crud = new CRUD(fileReaderWriter);
		String [][] files = crud.readFile();
		//crud.setFileReaderWriter(new DBFile());
		//crud.saveFile();
		return "Worked!";
	}
}
