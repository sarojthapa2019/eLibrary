package edu.mum.cs.cs425.demowebapps.elibrary.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value ={"/home"})
    public String dsiplayHome(){
        return "home/index";
    }

}
