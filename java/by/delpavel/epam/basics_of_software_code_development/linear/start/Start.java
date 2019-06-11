package by.delpavel.epam.basics_of_software_code_development.linear.start;


import by.delpavel.epam.basics_of_software_code_development.Calculate;
import by.delpavel.epam.basics_of_software_code_development.linear.model.*;


public class Start {


    public static void main(String[] args) {

        Calculate calculate;

        calculate = new Task1(1, 2, 3);
        calculate.calculate();

        calculate = new Task2(1, 2, 3);
        calculate.calculate();

        calculate = new Task3(1, 2);
        calculate.calculate();

        calculate = new Task4(123.456);
        calculate.calculate();

        calculate = new Task5(123456);
        calculate.calculate();

        calculate = new Task6();
        calculate.calculate();


    }

}
