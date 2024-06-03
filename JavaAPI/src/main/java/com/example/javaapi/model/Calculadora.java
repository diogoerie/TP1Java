package com.example.javaapi.model;

import org.springframework.stereotype.Service;

@Service
public class Calculadora {

    public double adicao(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        return a / b;
    }

    public double exponenciacao(double a, double b) {
        return Math.pow(a, b);
    }
}