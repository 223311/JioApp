/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jio.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jio.booking.bo.UserForm;

/**
 *
 * @author Optimus Prime
 */
@Controller
public class HomeController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String home() {
		return "redirect:free-jio-phone-pre-booking";
	}

	@RequestMapping(value="free-jio-phone-pre-booking", method = RequestMethod.GET)
	public String bookingForm(@ModelAttribute("booking") UserForm form) {
		return "free-jio-phone-pre-booking";
	}

}
