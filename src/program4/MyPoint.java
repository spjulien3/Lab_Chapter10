package program4;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
    }
    //Constructor
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //calculates the distance between two MyPoint objects
    public double distance (MyPoint p){
        double distance = Math.sqrt(Math.pow((x-p.x),2)+(Math.pow((y-p.y),2)));
        return distance;
    }
    //calculates distance between MyPoint and given X and y values
    public double distance (int x2,int y2){
        double distance = Math.sqrt(Math.pow((x-x2),2)+(Math.pow((y-y2),2)));
        return distance;
    }
}

