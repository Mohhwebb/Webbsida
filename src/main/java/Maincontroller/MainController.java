package Maincontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class MainController {

	@RestController
	public class HelloController {

		@RequestMapping("/")
		public String index() {
			return "index";
		}

	}
	
}
