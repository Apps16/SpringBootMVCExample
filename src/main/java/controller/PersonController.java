package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Model.Person;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String person(Model model) {
		Person p = new Person();
		p.setName("ABC");
		p.setNumber("zzzzzz");
		p.setPhone("2382093298");
		p.setPosition("Developer");
		model.addAttribute("person", p);
		return "personview";
	}

	@ResponseBody
	@RequestMapping("/")
	public String Hello() {
		return "Hello world";
	}

}
