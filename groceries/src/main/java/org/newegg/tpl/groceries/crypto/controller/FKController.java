package org.newegg.tpl.groceries.crypto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FKController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
