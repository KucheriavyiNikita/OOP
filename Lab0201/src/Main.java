import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int nLines = 0;

    public static void main(String[] args) {
        try{
            run();
        } catch (RuntimeException e){
            System.out.println(nLines + ": " + e.getMessage());
        }
    }
    public static void run(){
        Field field = new Field(20, 20);
        Turtle turtle = new Turtle(field, 0, 0, Turtle.RIGHT);

        ++nLines;
        UserCommand cmd = new UserCommand(scan);
        while (!cmd.getName().equals("exit")){
            switch (cmd.getName()){
                case "penup":
                    turtle.penUp();
                    break;
                case "pendown":
                    turtle.penDown();
                    break;
                case "turnleft":
                    turtle.turnLeft();
                    break;
                case "turnright":
                    turtle.turnRight();
                    break;
                case "move":
                    turtle.move(cmd.getDistance());
                    break;
                case "print":
                    field.print();
                    break;
            }
            ++nLines;
            cmd = new UserCommand(scan);
        }
    }
}
