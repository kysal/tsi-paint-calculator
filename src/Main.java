import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many walls: ");
        int numOfWalls = Integer.parseInt(scanner.next());

        float surfaceArea = 0;
        float heightOfWall;
        float widthOfWall;
        for (int i = 0; i < numOfWalls; i++) {
            System.out.print("What is the height of wall " + (i+1) + ": ");
            heightOfWall = Float.parseFloat(scanner.next());
            System.out.print("What is the width of wall " + (i+1) + ": ");
            widthOfWall = Float.parseFloat(scanner.next());
            surfaceArea += heightOfWall * widthOfWall;
        }

        System.out.print("Subtract windows? (y/n): ");
        String windowsAns = scanner.next();
        if (Objects.equals(windowsAns, "y")) {
            System.out.print("How many windows: ");
            int numOfWindows = Integer.parseInt(scanner.next());

            float heightOfWindow;
            float widthOfWindow;

            for (int i = 0; i < numOfWindows; i++) {
                System.out.print("What is the height of wall " + (i+1) + ": ");
                heightOfWindow = Float.parseFloat(scanner.next());
                System.out.print("What is the width of wall " + (i+1) + ": ");
                widthOfWindow = Float.parseFloat(scanner.next());
                surfaceArea -= heightOfWindow * widthOfWindow;
            }
        }

        System.out.println("You need " + (Math.round((surfaceArea / 6.5) * 100.0) / 100.0) + "l of paint.");
    }
}