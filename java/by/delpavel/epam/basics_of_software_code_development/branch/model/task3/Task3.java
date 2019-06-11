package by.delpavel.epam.basics_of_software_code_development.branch.model.task3;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task3 implements Calculate {

    private Point a;
    private Point b;
    private Point c;


    public Task3(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculate() {

        if (a.getX() == b.getX() && a.getX() == c.getX() || a.getY() == b.getY() && a.getY() == c.getY()) {
            System.out.println("Точки расположены на одной прямой");
        }else{
            System.out.println("Точки не расположены на одной прямой");
        }

    }
}
