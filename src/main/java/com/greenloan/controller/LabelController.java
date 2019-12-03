package com.greenloan.controller;

import com.greenloan.model.GreenLabel;
import com.greenloan.service.HibernateSearchService;
import com.greenloan.service.LabelService;
import com.greenloan.service.LoanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LabelController {

    @Autowired
    private HibernateSearchService searchservice;

    @Autowired
    private LabelService labelservice;

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(@RequestParam(value = "search", required = false) String q, Model model) {
        List<GreenLabel> searchResults = null;
        try {
        	labelservice.addLabels();
            searchResults = searchservice.fuzzySearch(q);

        } catch (Exception ex) {
            // here you should handle unexpected errors
            // ...
            // throw ex;
        }
        model.addAttribute("search", searchResults);
        return "index";

    }

}