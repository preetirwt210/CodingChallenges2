package academy.learnprogramming;

public class Point {
    private int x;
    private int y;

    public Point(){
    }
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }

    public double distance(){
        return Math.sqrt((getX()-0.0)*(getX()-0.0)+(getY()-0.0)*(getY()-0.0));
    }
    public double distance(int x, int y){
        return Math.sqrt((getX()-x)*(getX()-x)+(getY()-y)*(getY()-y));
    }
    public double distance(Point b){
        return Math.sqrt((getX()-b.getX())*(getX()-b.getX())+(getY()-b.getY())*(getY()-b.getY()));
    }
}
