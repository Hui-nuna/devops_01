package com.spring.app.controller;

import com.spring.app.Devops01Application;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final Devops01Application devops01Application;

    IndexController(Devops01Application devops01Application) {
        this.devops01Application = devops01Application;
    }

	@GetMapping("/")
	public String index() {
		return "index";
	}
}