package com.example.silsup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RakTest {

    @GetMapping("/sbbb")
    @ResponseBody
    public String index() {
        return "안녕 sbb는 누가써서 sbbb로와";
    }
}