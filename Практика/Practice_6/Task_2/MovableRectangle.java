package Practice.Practice_6.Task_2;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft = new MovablePoint();
    private MovablePoint bottomRight = new MovablePoint();

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.topLeft.xSpeed = xSpeed;
        this.topLeft.ySpeed = ySpeed;
        this.bottomRight.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
    }

    public void moveUp(){
        if (topLeft.ySpeed == bottomRight.ySpeed) {
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        } else {
            System.out.println("Error");
        }
    }

    public void moveDown(){
        if (topLeft.ySpeed == bottomRight.ySpeed) {
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        } else {
            System.out.println("Error");
        }
    }

    public void moveLeft(){
        if (topLeft.ySpeed == bottomRight.ySpeed) {
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        } else {
            System.out.println("Error");
        }
    }

    public void moveRight(){
        if (topLeft.ySpeed == bottomRight.ySpeed) {
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
