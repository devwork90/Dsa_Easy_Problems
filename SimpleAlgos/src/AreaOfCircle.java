import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius value");
        int radius = input.nextInt();
        double cycleArea = areaOfCircle(radius);
        System.out.println(cycleArea);
    }

    private static double areaOfCircle(int radius) {

        return Math.PI*Math.pow(radius,2);
    }
}
