package by.delpavel.epam.basics_of_software_code_development.linear.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task4 implements Calculate {

    private double r;

    public Task4(double r) {
        this.r = r;
    }

    public void calculate() {

        String number = "" + r;
        String fraction = number.substring(number.indexOf(".") + 1);
        String integer = number.substring(0, number.indexOf("."));

        System.out.println(fraction + "." + integer);


    }
}
