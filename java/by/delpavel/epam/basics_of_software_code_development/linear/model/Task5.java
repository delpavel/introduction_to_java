package by.delpavel.epam.basics_of_software_code_development.linear.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;


public class Task5 implements Calculate {

    private int t;

    public Task5(int t) {
        this.t = t;
    }

    public void calculate() {

        int hour = difference(t, 3600);
        int minute = difference(t - hour, 60);
        int second = t - hour - minute;

        System.out.println(hour / 3600 + "ч " + minute / 60 + "мин " + second + "с");


    }

    private int difference(int value, int divisor) {

        while (value % divisor != 0) {

            value = --value;

        }
        return value;
    }
}
