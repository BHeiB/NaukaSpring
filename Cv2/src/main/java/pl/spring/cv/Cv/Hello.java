package pl.spring.cv.Cv;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
    @RequestMapping("/hello") // wskazanie pod jakim adresem dostępna jest metoda
    public String hello() { // sygnatura metody
        return "Hello World! :)"; // zwracana wartość przez przeglądarkę 
    }////////http://localhost:8080/Cv/hello

}
