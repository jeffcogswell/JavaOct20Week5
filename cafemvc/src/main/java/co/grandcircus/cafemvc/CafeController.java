package co.grandcircus.cafemvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CafeController {

	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@PostMapping("/order")
	public String order(@RequestParam String name,@RequestParam String size, 
	@RequestParam(required=false) boolean upgrade, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("size", size);
		
		/*if (upgrade) {
			model.addAttribute("upgrade", "Shot of espresso");			
		}
		else {
			model.addAttribute("upgrade", "none");
		}*/
		
		model.addAttribute("upgrade", upgrade);
		
		double price = 0;
		
		if ("Grande".equals(size)) {
			price += 2.0;
		}
		else if ("Venti".equals(size)) {
			price += 3.0;
		}
		
		if (upgrade) {
			price += 1.0;
		}
		
		model.addAttribute("price", price);
		
		return "order";
	}
	
	@GetMapping("/hello")
	public String hello(String mysize, Model model) {
		
		model.addAttribute("size", mysize);
		return "hello";
	}
	
}
