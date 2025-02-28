public class Point {
    private int x,y;
    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    //Calculating the distance between two points and returns the result
    public double distance(Point p) {
        int x = this.x - p.x;
        int y = this.y - p.y;
        return Math.sqrt(x * x + y * y);
    }
    @Override
    public String toString() {
        return "X = "+x+", Y = "+y;
    }
}
