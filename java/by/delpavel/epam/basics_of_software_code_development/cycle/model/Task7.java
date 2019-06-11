package by.delpavel.epam.basics_of_software_code_development.cycle.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

import java.util.Scanner;

public class Task7 implements Calculate {

    private Scanner scanner;
    private int m;
    private int n;

    public void calculate() {

        if (scanner == null) {
            scanner = new Scanner(System.in);
        }

        try {

            if (m == 0) {
                m = input("Введите m (от)");
            }

            if (m == -1 ) {
                return;
            }


            if (n == 0) {
                n = input("Введите n (до)");
            }

            if (n == -1) {
                return;
            }


            for (int i = m; i < n; i++) {

                System.out.print("Число " + i + ", делители:");

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.print(i / j + ";");
                    }

                }
                System.out.println();


            }

            m = 0;
            n = 0;
            calculate();


        } catch (NumberFormatException nfe) {
            System.out.println("Не было введено число, повторите ввод!");
            calculate();

        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }


    }

    private int input(String text) {

        System.out.println(text);
        String value = scanner.next();

        if (value.equals("exit")) {

            return -1;
        }

        return Integer.parseInt(value);
    }

}
