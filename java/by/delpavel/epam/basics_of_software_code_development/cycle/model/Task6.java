package by.delpavel.epam.basics_of_software_code_development.cycle.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task6 implements Calculate {


    public void calculate() {


        for (int i = 32; i < 127; i++) {

            System.out.println("ascii="+i + " and char=" + (char)i);
        }

    }
}
