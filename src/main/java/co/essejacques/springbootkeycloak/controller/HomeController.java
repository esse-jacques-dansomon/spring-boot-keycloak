package co.essejacques.springbootkeycloak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author  : essejacques.co
 * Date    : 02/03/2023 19:58
 * Project : spring-boot-keycloak
 */


@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
