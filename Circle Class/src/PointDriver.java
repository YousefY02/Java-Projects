import java.util.Scanner;
public class PointDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Point p1 = new Point(2,4);
        Point p2 = new Point();
        //Printing first point
        System.out.println("First Point:");
        System.out.println(p1);

        System.out.println("Enter a  new point start with X value:");
        p2.setX(scan.nextInt());
        System.out.println("Y value:");
        p2.setY(scan.nextInt());

        System.out.println("The distance between the two points is "+p1.distance(p2));


    }
}
