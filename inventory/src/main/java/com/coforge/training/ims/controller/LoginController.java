package com.coforge.training.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/")
    public String viewHomePage() {

        return "index";
    }
}
