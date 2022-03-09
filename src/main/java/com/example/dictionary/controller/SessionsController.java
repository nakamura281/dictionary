package com.example.dictionary.controller;


import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionsController {
	@RequestMapping(path = "/")
	public String index() {
		return "pages/index";
	}

    @GetMapping(path = "/login")
    public String index1() {
        return "sessions/new";
    }

    @GetMapping(path = "/login-failure")
    public String loginFailure(Model model) {
        model.addAttribute("hasMessage", true);
        model.addAttribute("class", "alert-danger");
        model.addAttribute("message", "Emailまたはパスワードに誤りがあります。");

        return "sessions/new";
    }

    @GetMapping(path = "/logout-complete")
    public String logoutComplete(Model model) {
        model.addAttribute("hasMessage", true);
        model.addAttribute("class", "alert-info");
        model.addAttribute("message", "ログアウトしました。");

        return "layouts/complete";
    }
    
    @GetMapping(path = "/gest")
    public String indexgest() {
    	return "main/new";
    }
}
