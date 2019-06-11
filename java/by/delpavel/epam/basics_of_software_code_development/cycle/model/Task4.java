package by.delpavel.epam.basics_of_software_code_development.cycle.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

import java.math.BigInteger;

public class Task4 implements Calculate {


    public void calculate() {


        BigInteger sum = new BigInteger("1");

        for (int i = 1; i < 201; i++) {

            int multiply = i * i;

            sum = sum.multiply(new BigInteger("" + multiply));

        }

        System.out.println("Произведение квадратов первых 200 чисел: " + sum);

    }
}
