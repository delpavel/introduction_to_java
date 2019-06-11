package by.delpavel.epam.basics_of_software_code_development.branch.model.task4;


import by.delpavel.epam.basics_of_software_code_development.Calculate;

public class Task4 implements Calculate {

    private Hole hole;
    private Brick brick;

    public Task4(Hole hole, Brick brick) {
        this.hole = hole;
        this.brick = brick;
    }

    public void calculate() {

        if (hole.getSquare() >= brick.getX() * brick.getY() || hole.getSquare() >= brick.getX() * brick.getZ() || hole.getSquare() >= brick.getY() * brick.getZ()) {

            System.out.println("Корпич пройдет через отверстие");
        } else {
            System.out.println("Корпич не пройдет через отверстие");
        }

    }
}
