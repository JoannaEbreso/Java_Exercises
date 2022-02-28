package TurtleGraphics;

import java.util.Scanner;

public class TurtleGraphicsTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Turtle newTurtle = new Turtle();
        int command = sc.nextInt();

        boolean gameIsRunning = true;
        while (gameIsRunning) {
            switch (command) {
                case 1:
                    newTurtle.penUp();
                    break;

                case 2:
                    newTurtle.penDown();
                    break;

                case 3:
                    newTurtle.setDirection(Direction.right);
                    break;

                case 4:
                    newTurtle.setDirection(Direction.left);
                    break;

                case 5:
                    System.out.println("Enter number of steps: ");
                    int numberOfSteps = sc.nextInt();
//                    newTurtle.moveForward(numberOfSteps);
                    break;

                default:
                    break;

            }
        }
    }
}
