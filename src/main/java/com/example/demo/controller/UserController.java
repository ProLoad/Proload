package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "login";
	}
}
