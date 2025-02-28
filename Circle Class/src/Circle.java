public class Circle {
    private int r;
    private Point centrePoint;

    public Circle() {
    this.r = 0;
    this.centrePoint = new Point(0,0);
    }
    public Circle(Point centrePoint, int r){
        this.centrePoint = centrePoint;
        this.r = r;
    }

    public int getRadius() {
        return r;
    }

    public void setRadius(int r) {
        this.r = r;
    }

    public Point getCentrePoint() {
        return centrePoint;
    }

    public void setP(Point centrePoint) {
        this.centrePoint = centrePoint;
    }
    //Calculating Circle area
    public double getArea(){
        return Math.PI * Math.pow(r,2);
    }
    //Calculating Circle perimeter
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
    //This boolean method accepts input object of Point and returns true if the distance between the
    // point and centre point is smaller than the radius then the point is inside the circle
    public boolean contains(Point p){
        double distance = this.centrePoint.distance(p);
        return distance <= r;
    }
    /*This boolean method accepts Circle object as input and returns true if it is inside the current circle
    Calculates the distance between each centre point of the two circles
    checks if adding the radius of input circle to distance if it is smaller or bigger than the Circle 1 radius */
    public boolean contains(Circle c){
        //computing distance from distance method in Point class
        double distance =  this.centrePoint.distance(c.centrePoint);
        return distance + c.r < this.r;
    }
    
}


