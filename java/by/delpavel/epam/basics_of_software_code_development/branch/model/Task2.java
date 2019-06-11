package by.delpavel.epam.basics_of_software_code_development.branch.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task2 implements Calculate {

    private int a;
    private int b;
    private int c;
    private int d;

    public Task2(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void calculate() {

        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));



    }
}
