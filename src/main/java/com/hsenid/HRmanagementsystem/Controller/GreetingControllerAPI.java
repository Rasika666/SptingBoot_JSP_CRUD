package com.hsenid.HRmanagementsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingControllerAPI {

    @GetMapping("greeting")
    public String greeting(Map<String, Object> model) {
        model.put("Message", "Hi Rasika");
        return "greeting";
    }

}
