package com.pichincha.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    public static Integer sumar() {
        Scanner scanner = new Scanner(System.in);
        String opcion = scanner.nextLine();
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();

        switch (opcion) {
            case "suma":

                break;
        }
        return 0;
    }

}
