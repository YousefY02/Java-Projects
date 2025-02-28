public class CircleDriver {
    public static void main(String[] args) {
        Point centre = new Point(0,0);
        Circle circle1 = new Circle(centre,10);
        //Printing circle and getting it's area and perimeter
        System.out.println("Circle 1 centre point ="+centre+" radius ="+circle1.getRadius());
        System.out.println("Perimeter = "+circle1.getPerimeter());
        System.out.println("Area = "+circle1.getArea());

        Point insideCircle = new Point (4,5);
        Point outsideCircle = new Point (12,15);

        //testing contain method with two points one of them is inside the circle
        // and the other is outside
        System.out.println("Is point (4,5) inside the circle? "+circle1.contains(insideCircle));
        System.out.println("Is point (12,15) inside the circle? "+circle1.contains(outsideCircle));

        //declaring two new circle objects to test contain method
        Circle c2 = new Circle(new Point(2,4),3);
        Circle c3 = new Circle(new Point(15,15),5);
        System.out.println("Circle 2 centre and radius: "+c2.getCentrePoint()+":"+c2.getRadius());
        System.out.println("Circle 3 centre and radius: "+c3.getCentrePoint()+":"+c3.getRadius());

        //Testing if circle c2 and circle c3 if they are inside or outside circle 1
        System.out.println("If circle 2 or circle 3 are inside circle 1 the output is true otherwise false");
        System.out.println("Circle 2--> "+circle1.contains(c2));
        System.out.println("Circle 3--> "+circle1.contains(c3));


    }
}
