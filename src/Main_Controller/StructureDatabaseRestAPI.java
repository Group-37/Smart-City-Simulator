package Main_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/structureDatabase")
public class StructureDatabaseRestAPI {

	@Autowired
	private StructureDatabaseRepository repository;
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public String saveStructureDatabase(@RequestBody StructureDatabase structure)
	{
		repository.save(structure);
		return "";
	}
	
	@RequestMapping(value= "/all",method=RequestMethod.GET)
	public ResponseEntity<List<StructureDatabase>> getAllStructures()
	{
		List<StructureDatabase> structures = (List<StructureDatabase>)repository.findAll();
		return new ResponseEntity<List<StructureDatabase>>(structures, HttpStatus.OK);
	}
}
