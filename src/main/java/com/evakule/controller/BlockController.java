package com.evakule.controller;

import com.evakule.model.Block;
import com.evakule.service.PalindromeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;
import java.util.List;

@Controller
public class BlockController {

    @Autowired
    PalindromeServiceImpl palindromeServiceImpl;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView getHome(ModelAndView modelAndView) {
        return getAllBlockList();
    }

    @RequestMapping(value = "/add-block", method = RequestMethod.GET)
    public ModelAndView addBlock(ModelAndView modelAndView) {

        modelAndView.addObject("block", new Block());
        modelAndView.setViewName("addBlock");
        return modelAndView;
    }

    @RequestMapping(value = "/add-block", method = RequestMethod.POST)
    public ModelAndView addBlock(@ModelAttribute Block block) {
        palindromeServiceImpl.addBlock(block);
        return getAllBlockList();
    }

    private ModelAndView getAllBlockList() {
        List<Block> palindromeList = palindromeServiceImpl
                .getAll()
                .orElseGet(Collections::emptyList);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("palindromeList", palindromeList);
        modelAndView.setViewName("home");
        return modelAndView;
    }
}