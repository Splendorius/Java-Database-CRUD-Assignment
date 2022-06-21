package com.example.bazy_danych_zadanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
public class BazyDanychZadanieApplication {

    @Autowired
    Select_controller service;

    public static void main(String[] args) {
        SpringApplication.run(BazyDanychZadanieApplication.class, args);
    }

}
