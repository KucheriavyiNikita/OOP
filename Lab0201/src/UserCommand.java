import java.util.Scanner;

public class UserCommand {
    private String name;
    private int distance;

    public UserCommand(Scanner scan) {
        String line = scan.nextLine().trim().toLowerCase();

        name = "";

        if (line.length()== 0){
            return;
        }
        Scanner scan2 = new Scanner(line);
        name = scan2.next();

        switch (name){
            case "penup":
            case "pendown":
            case "turnleft":
            case "turnright":
            case "move":
            case "print":
            case "exit":
                break;
            default:
                throw new RuntimeException("incorect command");
        }
        if (name.equals("move")){
            if (!scan2.hasNextInt()){
                throw new RuntimeException("distance is not specified");
            }
            distance = scan.nextInt();
            if (distance < 0){
                distance = 0;
                throw new RuntimeException("negative distance");
            }
            if (scan2.hasNext()){
                throw new RuntimeException("too many arguments");
            }
        }
    }
    public String getName(){
        return name;
    }
    public int getDistance(){
        return distance;
    }
}
