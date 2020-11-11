package co.grandcircus.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	// Index /
	@GetMapping("/")
	public String index() {
		System.out.println("INDEX");
		return "index";
	}
	
	// All employees /employee
	@GetMapping("/employee")
	public String employees(Model model) {
		System.out.println("EMPLOYEES");
		
		model.addAttribute("emps", Employee.Employees);
		
		return "employees";
	}
	
	
	// SINGLE employee detail /employee/id
	@GetMapping("/employee/{id}")
	public String detail(@PathVariable int id, Model model) {
		System.out.println("DETAIL for " + id);
		Employee emp = Employee.Employees.get(id);
		model.addAttribute("firstname", emp.getFirstName());
		model.addAttribute("lastname", emp.getLastName());
		model.addAttribute("id", emp.getId());
		model.addAttribute("phone", emp.getPhoneNumber());
		model.addAttribute("email", emp.getEmail());
		model.addAttribute("department", emp.getDepartment());
		return "detail";
	}
	
	
	// SEARCH employee /employee/search?emp=???
	@GetMapping("/employee/search")
	public String search(String emp, Model model) {
		System.out.println("SEARCHING FOR " + emp);
		List<Employee> results = new ArrayList<Employee>();
		
		for (Employee entry : Employee.Employees.values()) {
			
			System.out.println("Checking " + entry.getLastName());
			if (entry.getLastName().startsWith(emp)) {
				results.add(entry);
			}
		}
		
		System.out.println(results.size());
		
		model.addAttribute("results", results);
		return "search";
	}

}
