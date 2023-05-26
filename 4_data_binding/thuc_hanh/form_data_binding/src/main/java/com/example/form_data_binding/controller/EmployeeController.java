package com.example.form_data_binding.controller;

import com.example.form_data_binding.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee/")
public class EmployeeController {
    @GetMapping("showForm")
    public String showForm(Model model){
        model.addAttribute("employee",new Employee());
        return "/create";
    }
    @PostMapping("addEmployee")
    public String submit(@ModelAttribute("employee") Employee employee,Model model){
        model.addAttribute("name",employee.getName());
        model.addAttribute("id",employee.getId());
        model.addAttribute("contactNumber" ,employee.getContactNumber());
        return "/info";
    }

}
