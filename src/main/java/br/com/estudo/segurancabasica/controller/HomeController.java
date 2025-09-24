package br.com.estudo.segurancabasica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String publicPage() {
        return "Bem-vindo! Esta é a página pública.";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Olá, Usuário! Bem-vindo à sua área.";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Olá, Administrador! Bem-vindo à área secreta.";
    }

}
