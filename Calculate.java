package com.company;
import java.math.*;
public class Calculate {
    public static String str;

    public static String bmi (double weight, double height){
        try {
            double result = weight / (height * height);
            if(result <= 18.5){return "Underweight";}
            if(result <= 25.0){return "Normal";}
            if(result <= 30.0){return "Overweight";}
            if(result > 30){return "Obese";}
            str = String.valueOf(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;

    }
}
