package co.grandcircus.jstldemos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@GetMapping("/couttest")
	public String couttest(Model model) {
		System.out.println("COUTTEST");
		
		String message = "Hello <b>world</b><script>alert('Your food sucks!');</script>";
		model.addAttribute("message", message);
		return "couttest";
	}
	
	@GetMapping("/ciftest")
	public String ciftest(Model model) {
		
		boolean upgrade = true;
		boolean option1 = false;
		
		model.addAttribute("upgrade", upgrade);
		model.addAttribute("option1", option1);
		
		return "ciftest";
	}
	
	@GetMapping("/choosedemo")
	public String choosedemo(Model model) {
		String size = "small";
		model.addAttribute("size", size);
		return "choosedemo";
	}
	
	// This is virtually identical to the one above
	// Except I'm putting the logic in the controller
	// EITHER WAY IS FINE
	@GetMapping("/choosedemo2")
	public String choosedemo2(Model model) {
		String size = "small";
		String message;
		
		if (size == "small") {
			message = "Thank you for choosing a small pizza";
		}
		else if (size == "medium") {
			message = "Our medium pizzas are awesome!";
		}
		else if (size == "large") {
			message = "Large is the best!";
		}
		else {
			message = "We don't have pizzas of size " + size;
		}
		model.addAttribute("message", message);
		
		return "choosedemo2";
	}
	
	/*
	 * CHECK BOX DEMO
	 * Check box items come in as an array of strings
	 */
	@GetMapping("/toppings")
	public String toppings() {
		return "toppings";
	}
	
	// Make sure the below "PostMapping" vs "GetMapping" MATCHES
	// what you have in the form as in <form method="post"  vs  <form method="get"
	// Then the rest of the code can remain unchanged
	@PostMapping("/posttoppings")
	public String posttoppings(
	@RequestParam(defaultValue = "", required=false) String[] meattoppings,
	@RequestParam(defaultValue = "", required=false) String[] veggietoppings,
	Model model) {
		
		/*
		 * The parameters can also be ArrayList<String>
		 * But my println code below won't work with those
		 * because I'm using .length. Otherwise we can use
		 * ArrayList just the same as we're using array of strings.
		 */
		
		System.out.println(meattoppings.length);
		System.out.println(veggietoppings.length);
		
		for (int i=0; i<meattoppings.length; i++) {
			System.out.println(meattoppings[i]);
		}
		
		for (int i=0; i<veggietoppings.length; i++) {
			System.out.println(veggietoppings[i]);
		}
		
		model.addAttribute("meattoppings", meattoppings);
		model.addAttribute("veggietoppings", veggietoppings);
		
		return "posttoppings";
	}
	
	/*
	 * 
	 *    Difference between path variables
	 *    and parameters (both query like ?a=3&b=2 and post forms
	 *    The above works for parameters.
	 *    Now let's look at path variables
	 */
	
	@GetMapping("/detail/{name}")
	public String detail(@PathVariable("name") String name, Model model) {
		System.out.println(name);
		model.addAttribute("name", name);
		return "detail";
	}
	
	/*
	 * Some simple SERVER SIDE VALIDATION
	 * We receive a number, and we see if it's inside a range.
	 * If it is, we take them to a page printing out the numbrer
	 * Otherwise, we take them to an error page.
	 */
	@GetMapping("/validationform")
	public String validationform() {
		return "validationform";
	}
	
	@PostMapping("/validate")
	public String validate(int mynumber, Model model) {
		
		if (mynumber >= 1 && mynumber <= 10) {
			model.addAttribute("mynumber", mynumber);
			return "validate";
		}
		else {
			return "errornumber";
		}
		
	}
	
}











