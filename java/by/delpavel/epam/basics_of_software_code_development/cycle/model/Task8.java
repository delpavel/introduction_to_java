package by.delpavel.epam.basics_of_software_code_development.cycle.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task8 implements Calculate {

    private int number1;
    private int number2;


    public Task8(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void calculate() {


        String lengthNumber1 = "" + number1;
        String lengthNumber2 = "" + number2;


        char[] charNumber1 = lengthNumber1.toCharArray();
        char[] charNumber2 = lengthNumber2.toCharArray();

        System.out.print("Число " + number1 + " состоит из цифр:");

        for (int i = 0; i < lengthNumber1.length(); i++) {

            System.out.print(charNumber1[i] + ";");
        }
        System.out.println();

        System.out.print("Число " + number2 + " состоит из цифр:");

        for (int i = 0; i < lengthNumber2.length(); i++) {

            System.out.print(charNumber2[i] + ";");
        }


    }
}
