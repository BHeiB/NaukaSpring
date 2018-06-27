package pl.spring.cv.Cv;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackageClasses = Hello.class)
public class CvApplication {
	
	@Autowired
	Hello2 hello;

	public static void main(String[] args) {
		SpringApplication.run(CvApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		System.out.println(hello.sayHello());
	}
}
