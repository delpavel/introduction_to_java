package by.delpavel.epam.basics_of_software_code_development.branch.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task1 implements Calculate {

    private int a;
    private int b;
    private int c;

    public Task1(int a, int b) {
        this.a = a;
        this.b = b;
        c = 180 - a - b;
    }

    public void calculate() {

        if (c > 0 && a != 0 && b != 0) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }


        if (c > 0 && (a == 90 || b == 90 || c == 90)) {
            System.out.println("Треугольник прямоугольный");
        }


    }
}
