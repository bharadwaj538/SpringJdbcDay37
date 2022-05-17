package ai.jobiak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

	@Controller 
	public class UserController {
	@RequestMapping(value="come2",method=RequestMethod.GET)
		public String message(ModelMap map) {
		  map.put("username", "Bharadwaj"); 
		  map.put("password", "********");
		  map.put("otp", "532410");
		  return "viewer";
		}	 
	}		
