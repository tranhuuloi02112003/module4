package com.example.display_spice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
public String save(@RequestParam("condiment") String []condiment , Model model){

}

}
