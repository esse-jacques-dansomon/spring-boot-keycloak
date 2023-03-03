package co.essejacques.springbootkeycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author  : essejacques.co
 * Date    : 02/03/2023 19:58
 * Project : spring-boot-keycloak
 */


@RestController
@RequestMapping("/api/home")
public class HomeRestController {

    @GetMapping("/")
    @ResponseStatus(org.springframework.http.HttpStatus.OK)
    public String home() {
        return "home";
    }
}
