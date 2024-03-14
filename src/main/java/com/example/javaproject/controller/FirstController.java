package com.example.javaproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController { // 클래스 이름은 관례적으로 첫 글자를 대문자로 작성합니다.
    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "LEE");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "KIM");
        return "goodbye";
    }
}
