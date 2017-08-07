package ru.kru.nick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kru on 20.07.2017.
 */
@Controller
@EnableAutoConfiguration
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hi manigga";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainController.class, args);
    }
}
