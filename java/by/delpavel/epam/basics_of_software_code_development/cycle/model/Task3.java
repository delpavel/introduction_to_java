package by.delpavel.epam.basics_of_software_code_development.cycle.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task3 implements Calculate {


    public void calculate() {


        int sum = 0;
        for (int i = 1; i < 101; i++) {

            sum = sum + i * i;

        }

        System.out.println("Сумма квадратов первых 100 числе: " + sum);

    }
}
