
public class Main {

    public static void main(String[] args) {
        try {


            Field field = new Field(20, 20);
            Turtle turtle = new Turtle(field,0,0,Turtle.RIGHT);

            turtle.penDown();
            turtle.move(10);
            field.print();

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}