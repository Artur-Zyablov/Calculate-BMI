package com.company;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.RuntimeException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Вес Рост в метрах сцуко");

        while (true) {
            try {
                str = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException("Неверный ввод");
            }

            String[] expr = str.split("\\s+");

            if (expr.length != 2) {
                throw new RuntimeException("Неверный формат выражения");
            }

            double weight = Double.parseDouble(expr[0]);
            double height = Double.parseDouble(expr[1]);
            System.out.println(Calculate.bmi(weight,height));


        }
    }
}
