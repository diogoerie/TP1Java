package com.example.javaapi.controller;



import com.example.javaapi.model.Calculadora;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private Calculadora calculadora;

    @GetMapping("/adicao")
    public double adicaoG(@RequestParam double a, @RequestParam double b) {
        return calculadora.adicao(a, b);
    }

    @PostMapping("/adicao")
    public double adicaoP(@RequestParam double a, @RequestParam double b) {
        return calculadora.adicao(a, b);
    }

    @GetMapping("/subtracao")
    public double subtracao(@RequestParam double a, @RequestParam double b) {
        return calculadora.subtracao(a, b);
    }

    @PostMapping("/subtracao")
    public double subtracaoP(@RequestParam double a, @RequestParam double b) {
        return calculadora.subtracao(a, b);
    }

    @GetMapping("/multiplicacao")
    public double multiplicacaoG(@RequestParam double a, @RequestParam double b) {
        return calculadora.multiplicacao(a, b);
    }

    @PostMapping("/multiplicacao")
    public double multiplicacaoP(@RequestParam double a, @RequestParam double b) {
        return calculadora.multiplicacao(a, b);
    }

    @GetMapping("/divisao")
    public double divisaoG(@RequestParam double a, @RequestParam double b) {
        return calculadora.divisao(a, b);
    }

    @PostMapping("/divisao")
    public double divisaoP(@RequestParam double a, @RequestParam double b) {
        return calculadora.divisao(a, b);
    }

    @GetMapping("/exponenciacao")
    public double exponenciacaoG(@RequestParam double a, @RequestParam double b) {
        return calculadora.exponenciacao(a, b);
    }

    @PostMapping("/exponenciacao")
    public double exponenciacaoP(@RequestParam double a, @RequestParam double b) {
        return calculadora.exponenciacao(a, b);
    }
}