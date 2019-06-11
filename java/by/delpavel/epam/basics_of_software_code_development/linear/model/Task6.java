package by.delpavel.epam.basics_of_software_code_development.linear.model;


import by.delpavel.epam.basics_of_software_code_development.Calculate;


public class Task6 implements Calculate {

    private byte[][] array = new byte[14][11];


    public void calculate() {

        for (int line = 4; line < 8; line++) {

            for (int column = 3; column < 7; column++) {

                array[line][column] = 1;

            }

        }

        for (int line = 2; line < 10; line++) {

            for (int column = 7; column < 10; column++) {

                array[line][column] = 1;

            }

        }


        for (int j = 0; j < 11; j++) {

            for (int i = 0; i < 14; i++) {

                if (array[i][j] == 1) {
                    System.out.print(true + " ");
                } else {
                    System.out.print(false + " ");
                }
            }
            System.out.println("\r");

        }


    }


}
