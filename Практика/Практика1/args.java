package Практика.Практика1;

public class args {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i+1) + ": " + args[i]);
        }
    }
}

//java src\args.java one two