package by.delpavel.epam.basics_of_software_code_development.cycle.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;


public class Task5 implements Calculate {

    private int membership;
    private double number;

    public Task5(int membership, double number) {
        this.membership = membership;
        this.number = number;
    }

    public void calculate() {

        double sum = 0;

        for (int i = 1; i < membership; i++) {

            double a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (a >= Math.abs(number)) {
                sum = sum + (1 / Math.pow(2, i) + 1 / Math.pow(3, i));
            }

        }

        System.out.println("Сумма членов ряда: " + sum);

    }
}
