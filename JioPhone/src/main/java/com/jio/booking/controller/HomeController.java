/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jio.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jio.booking.bo.UserForm;
import com.jio.booking.service.JioBookingService;

/**
 *
 * @author Optimus Prime
 */
@Controller
public class HomeController {

	@Autowired
	private JioBookingService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "redirect:free-jio-phone-pre-booking";
	}

	@RequestMapping(value = "free-jio-phone-pre-booking", method = RequestMethod.GET)
	public String bookingForm(@ModelAttribute("booking") UserForm form) {
		return "free-jio-phone-pre-booking";
	}
	
	@RequestMapping(value = "free-jio-phone-booking-share")
	public String share() {
		System.out.println("Entered into Share");
		return "free-jio-phone-booking-share";
	}

	@RequestMapping(value = "free-jio-phone-pre-booking", method = RequestMethod.POST)
	public String bookingFormSubmit(@ModelAttribute("booking") UserForm form) {
		System.out.println(form);
		service.bookJioPhone(form);

		return "forward:free-jio-phone-booking-share";
	}
	
	@RequestMapping(value = "free-jio-phone-booking-final", method = RequestMethod.GET)
	public String finalSubmit() {

		return "free-jio-phone-booking-final";
	}

}
