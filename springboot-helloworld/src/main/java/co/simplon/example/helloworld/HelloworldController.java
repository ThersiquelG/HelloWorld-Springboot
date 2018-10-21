package co.simplon.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {
	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String returnH() {
		return "Hello World ! First Srpingboot Project here";
	}

}
