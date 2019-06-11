package by.delpavel.epam.basics_of_software_code_development.branch.start;


import by.delpavel.epam.basics_of_software_code_development.Calculate;
import by.delpavel.epam.basics_of_software_code_development.branch.model.Task1;
import by.delpavel.epam.basics_of_software_code_development.branch.model.Task2;
import by.delpavel.epam.basics_of_software_code_development.branch.model.Task5;
import by.delpavel.epam.basics_of_software_code_development.branch.model.task3.Point;
import by.delpavel.epam.basics_of_software_code_development.branch.model.task3.Task3;
import by.delpavel.epam.basics_of_software_code_development.branch.model.task4.Brick;
import by.delpavel.epam.basics_of_software_code_development.branch.model.task4.Hole;
import by.delpavel.epam.basics_of_software_code_development.branch.model.task4.Task4;

public class Start {


    public static void main(String[] args) {

        Calculate calculate;

        calculate = new Task1(80, 20);
        calculate.calculate();

        calculate = new Task2(106, 25, 32, 48);
        calculate.calculate();

        calculate = new Task3(new Point(10, 21), new Point(10, 20), new Point(10, 50));
        calculate.calculate();

        calculate = new Task4(new Hole(10, 21), new Brick(10, 20, 10));
        calculate.calculate();

        calculate = new Task5(3);
        calculate.calculate();


    }

}
