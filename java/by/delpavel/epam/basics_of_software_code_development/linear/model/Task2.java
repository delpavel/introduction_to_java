package by.delpavel.epam.basics_of_software_code_development.linear.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task2 implements Calculate {

    private int a;
    private int b;
    private int c;

    public Task2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculate() {

        double firstOperation = b + Math.sqrt(Math.pow(b, 2) + 4 * a * c);
        double secondOperation = firstOperation / 2 * a;
        double thirdOperation = Math.pow(a, 3) * c + Math.pow(b, -2);
        double fourthOperation = secondOperation - thirdOperation;


        System.out.println(fourthOperation);


    }
}
