package com.example.bazy_danych_zadanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Select_controller {

    @Autowired
    SelectService service;

    @RequestMapping(value = "/users.html", method = RequestMethod.GET)
    public String index(Model md){
        md.addAttribute("name_2", service.findAll());
        return "users";
}

}
