package by.delpavel.epam.basics_of_software_code_development.cycle.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

import java.util.Scanner;

public class Task1 implements Calculate {

    private Scanner scanner;

    public void calculate() {

        if (scanner == null) {
            scanner = new Scanner(System.in);
        }

        try {

            String text = scanner.next();

            if (text.equals("exit")) {

                return;
            }

            int number = Integer.parseInt(text);

            if (number > 0) {

                int sum = 0;
                for (int i = 0; i < number; i++) {

                    sum = sum + i;

                }
                System.out.println("Cумма чисел равна:" + sum);
                calculate();

            } else {
                System.out.println("Введенное число меньше либо равно 0, повторите ввод!");
                calculate();
            }

        } catch (NumberFormatException nfe) {
            System.out.println("Не было введено число, повторите ввод!");
            calculate();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }


    }

}
