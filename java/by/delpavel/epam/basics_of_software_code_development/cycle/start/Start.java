package by.delpavel.epam.basics_of_software_code_development.cycle.start;


import by.delpavel.epam.basics_of_software_code_development.Calculate;
import by.delpavel.epam.basics_of_software_code_development.cycle.model.*;


public class Start {


    public static void main(String[] args) {

        Calculate calculate;

        calculate = new Task1();
        calculate.calculate();

        calculate = new Task2(-5, 5, 2);
        calculate.calculate();

        calculate = new Task3();
        calculate.calculate();

        calculate = new Task4();
        calculate.calculate();

        calculate = new Task5(35,-0.019);
        calculate.calculate();

        calculate = new Task6();
        calculate.calculate();

        calculate = new Task7();
        calculate.calculate();

        calculate = new Task8(2569,2587);
        calculate.calculate();



    }

}
