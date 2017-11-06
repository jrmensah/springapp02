package me.jrmensah.firstspringapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Controller
public class MainController {



    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myvar", "Say hello to the people");
        return "hometemplate";
    }

    @RequestMapping("/localdatetime")
    public String showLocalDateTime(Model model){
        LocalDateTime rightNow= LocalDateTime.now();

        DateTimeFormatter shortMonthFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
        model.addAttribute("shortMonthFormat", "Current Date:" + rightNow.format(shortMonthFormat));
        return "dateboot";

    }
}
