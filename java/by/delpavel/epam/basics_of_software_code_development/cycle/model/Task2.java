package by.delpavel.epam.basics_of_software_code_development.cycle.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task2 implements Calculate {

    private int a;
    private int b;
    private int h;

    public Task2(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void calculate() {


        for (int i = a; i <= b; i += h) {


            if (i > 2) {
                System.out.println("Значение Y в точке [" + i + "," + i + "] = " + i);
            }

            if (i <= 2) {
                if (i < 0) {
                    System.out.println("Значение Y в точке [" + i + "," + i + "] = " + i);
                } else {
                    System.out.println("Значение Y в точке [" + i + "," + i + "] = " + -i);
                }
            }


        }


    }
}
