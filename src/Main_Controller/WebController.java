package Main_Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/SmartCitySimulator")
public class WebController {
	
	
	@RequestMapping("/run")
	public String run()
	{
		Main_Controller.Controller controller = new Main_Controller.Controller();
		controller.run();
		return "index";
	}
}
