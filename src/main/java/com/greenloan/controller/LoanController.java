package com.greenloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.greenloan.service.LoanService;

@Controller
public class LoanController {

    @Autowired
    private LoanService loanservice;
	
	@RequestMapping(value = "/loans", method = RequestMethod.GET)
    public String loanList(Model model) {

    	//API call to get the loans, in the mean time just a static list for the demo
    	model.addAttribute("loans", loanservice.loanList());
    	return "loans";

    }
	
	public ModelAndView redirect(Model model) {
		return null;
		
	}
	
}
