package boot.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import boot.model.Employee;

@Controller
public class HelloController {
	
	@PostMapping(value="/success")
	public String hello(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult, Model model)
	{	
		if (bindingResult.hasErrors()) {
			System.out.println("inside binding result method");
			return "login";
		}	
		model.addAttribute("name", emp.getUsername());		
		return "success";	
	}
	
	@RequestMapping(value="/")	
	public String employee(Employee employee)
	{		
		return "login";
	}
	
}
