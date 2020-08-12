package com.internationalization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Muhammad Saimon
 * @since Aug 8/12/20 7:19 PM
 */

@Controller
public class ViewController {

    @GetMapping
    public String home() {
        return "index";
    }

}
