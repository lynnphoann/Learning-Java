public class Point {
    private int x;
    private int y;
    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance(){
        return distance(0,0);
    }
    public double distance(Point a){
        System.out.println("check1");
        return distance(this.x,a.y);
    }

    public double distance(int x,int y){
        // System.out.println("check2");
        int xDiff =this.x- x;
        int yDiff = this.y - y;
        System.out.println(xDiff);
        System.out.println(yDiff);
        System.out.println(x);
        System.out.println(y);
        System.out.println(this.x);
        System.out.println(this.y);

        return Math.sqrt(xDiff * xDiff + yDiff *xDiff);
    }
}

