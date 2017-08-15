/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jio.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jio.booking.model.User;

/**
 *
 * @author Optimus Prime
 */
@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String register(@ModelAttribute("user") User user) {

		return null;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String register(BindingResult result) {

		return null;
	}

}
