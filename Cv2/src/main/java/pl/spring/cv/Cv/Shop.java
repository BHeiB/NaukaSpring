package pl.spring.cv.Cv;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Shop {
	
	
	@RequestMapping(value = "/example", method = RequestMethod.GET)
	@ResponseBody
	public String purchase() {
		return "example";
	}
	
	@RequestMapping("/exampleRequestHeader")
	@ResponseBody
	public String requestHeaderExample(@RequestHeader("number") Long number) {
		return "dostarczone przez naglowek " + number;
	}
	@RequestMapping("/requestParam")
	@ResponseBody
	public String requestParamExample(@RequestParam("number") Long number) {
		return "dostarczone przez naglowek " + number;
	}
	@RequestMapping("/examplePathVariable/{number}")
	@ResponseBody
	public String pathVariableExample(@PathVariable("number") Long number) {
	    return "delivered by PathVariable: " + number;
	}
	
	@RequestMapping(value = "/requestBody", method = RequestMethod.POST)
	@ResponseBody
	public String requestBodyExample(@RequestBody Long number) {
	    return "delivered by RequestBody: " + number;
	}
	



}
