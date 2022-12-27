package com.example.s.ex3.good;

public class Main {

    public static void main(String[] args) {

        UserLogin userLogin = new UserLogin();
        // responsabilidad 1
        User user = userLogin.login("alan", "admin");
        MailService mailService = new MailService();
        // responsabilidad 2
        mailService.sendEmail(user, "Inicio de sesión desde nuevo dispositivo.");
    }
}
