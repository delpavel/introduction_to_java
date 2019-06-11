package by.delpavel.epam.basics_of_software_code_development.linear.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task3 implements Calculate {

    private int x;
    private int y;

    public Task3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calculate() {

        double firstOperation = Math.sin(x) + Math.cos(y);
        double secondOperation = Math.cos(x) - Math.sin(y);
        double thirdOperation = firstOperation / secondOperation;
        double fourthOperation = Math.tan(x * y);
        double fifthOperation = thirdOperation * fourthOperation;


        System.out.println(fifthOperation);


    }
}
