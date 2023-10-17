package Practice.Practice_6.Task_1;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center = new MovablePoint();

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
        this.radius = radius;
    }

    public void moveUp(){
        center.y += center.ySpeed;
    }

    public void moveDown(){
        center.y -= center.ySpeed;
    }

    public void moveLeft(){
        center.x -= center.xSpeed;
    }

    public void moveRight(){
        center.x += center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
