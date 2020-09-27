package com.urbain.photocollector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdresseController {

	@GetMapping("/adresses")
	public String afficherAdresses(Model model) {
		
		String message = "Bonjour Index !";
		
		model.addAttribute("message", message);
		
		return "index";
	}
	
	
}
