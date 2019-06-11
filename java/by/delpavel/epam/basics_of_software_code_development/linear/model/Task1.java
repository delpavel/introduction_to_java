package by.delpavel.epam.basics_of_software_code_development.linear.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task1 implements Calculate {

    private int a;
    private int b;
    private int c;

    public Task1(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculate() {


       int z = ((a - 3) * b / 2) + c;

        System.out.println(z);


    }
}
