package com.klu.JFSDS25_SBDEMO;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
	

    @GetMapping("/form")
    public String form() {
        return "form";  
    }

    @PostMapping("/submitForm")
    @ResponseBody
    public String submitForm(@RequestParam("name") String name, @RequestParam("mobileNumber") String mobileNumber,Model model) {
        model.addAttribute("name", name);
        model.addAttribute("mobileNumber", mobileNumber);
        return "display";  
    }
    
    
    @GetMapping("/input/{message}")
    public String displayMessage(@PathVariable("message") String message,Model model) {
    	 model.addAttribute("messgae", message);
        return "display";
    }
    
    
    @GetMapping("/sum/{a}/{b}")
    public String calculateSum(@PathVariable int a, @PathVariable int b, Model model) {
        int sum = a + b;
        model.addAttribute("sum", sum);  
        return "sumDisplay";  
    }
   
}
