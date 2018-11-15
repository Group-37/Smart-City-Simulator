package Main_Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/SmartCitySimulator")
public class WebController {
	
	@Autowired
    private SimpMessagingTemplate template;
	
	@RequestMapping("/index")
	public String run()
	{
		return "index";
	}
	
	@RequestMapping(value="/continue" ,method = RequestMethod.POST)
	@ResponseBody
	public String results(@RequestBody String response)
	{
		response = response.replace("%2C", ",");
		response = response.replace("%5C", "/");
		response = response.replace("%2F", "/");
		response = response.replaceAll("=", "");
		String [] splitByComma = response.split(",");
		Main_Controller.Controller controller = new Main_Controller.Controller(splitByComma[1], splitByComma[0]);
		controller.run();
		System.out.println("<------------------------------->");
		System.out.println(controller.getDetails());
		System.out.println("<------------------------------->");
		/*
		String [] splitByLine = controller.getDetails().split("\n");
		for (int i = 0; i < splitByLine.length; i++)
		{
			splitByLine[i] = splitByLine[i].replaceAll(" ", "0");
			template.convertAndSend("/topic/results", splitByLine[i]);
		}
		*/
		template.convertAndSend("/topic/results", controller.getDetails());
		template.convertAndSend("/topic/results", controller.getResults());
		return "";
	}
}
