package com.farmstory.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminIndexController {

    @GetMapping("/admin/AdminIndex")
    public String AdminIndex() {
        return "/admin/AdminIndex";
    }
}
