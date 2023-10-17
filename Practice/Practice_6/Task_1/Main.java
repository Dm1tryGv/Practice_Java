package Practice.Practice_6.Task_1;

public class Main {
    public static void main(String[] args){
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println(point.toString());
        ((Movable) point).moveUp();
        System.out.println(point.toString());
    }
}
