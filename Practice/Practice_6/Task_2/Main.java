package Practice.Practice_6.Task_2;

public class Main {
    public static void main(String[] args){
        MovableRectangle rect = new MovableRectangle(0, 0, 1, 1, 1, 1);
        System.out.println(rect.toString());
        ((Movable) rect).moveUp();
        System.out.println(rect.toString());
    }
}
