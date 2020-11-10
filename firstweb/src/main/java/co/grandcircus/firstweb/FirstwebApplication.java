package co.grandcircus.firstweb;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstwebApplication {

	/*
	 *  This code is the "Controller" "C"
	 *  We also have a collection of classes called a "Model" "M"
	 *  The HTML we're sending down to the browser is called the "View" "V"
	 *  Together these are called Model/View/Controller or MVC
	 */
	
	@GetMapping("/hello")
	public String hello() {
		Date d = new Date();
		return "Welcome. The time is " + d.toString();
	}
	
	@GetMapping("/goodbye/{word}")
	public String bigpath( @PathVariable("word") String word) {
		return "Hello from bigpath " + word;
	}
	
	@GetMapping("/goodbye/abc")
	public String goodbye() {
		return "<h1>Goodbye</h1><script>alert('Welcome');</script>";
	}
	
	@GetMapping("/hello/goodbye")
	public String hellogoodbye(String name, String number) {
		return "<h1>Hello, Goodbye</h1>" + name + " " + number + "!!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FirstwebApplication.class, args);
	}

}
