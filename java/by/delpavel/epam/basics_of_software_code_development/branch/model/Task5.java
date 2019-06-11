package by.delpavel.epam.basics_of_software_code_development.branch.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task5 implements Calculate {

    private int value;

    public Task5(int value) {
        this.value = value;
    }

    public void calculate() {

        if (value <= 3) {
            System.out.println("F(x)=" + (Math.pow(value, 3) - 3 * value + 9));
        } else {
            System.out.println("F(x)=" + 1 / (Math.pow(value, 3) + 6));
        }

    }
}
