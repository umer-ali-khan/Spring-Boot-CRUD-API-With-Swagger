package io.springbootrestapi.starterapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
//	@RequestMapping("/error")
//	public String defaultGreetings() {
//		return "Please use url/hello";
//	}
	
}
