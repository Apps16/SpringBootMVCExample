package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingsController {

	String name;

	@RequestMapping(path = "/greeting", method = RequestMethod.GET)
	@ResponseBody
	public String Hello(@RequestParam("name") String who) {
		return String.format("Good Afternoon %s", who == null || who.isEmpty() ? name : who);
	}
}
