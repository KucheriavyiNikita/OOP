public class Turtle {
    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;

    Field field;
    int row;
    int col;
    int dir;
    boolean isPenDown;

    public Turtle(Field aField, int aRow, int aCol, int aDir){
        field = aField;
        if (!field.inRange(aRow, aCol)){
            throw new RuntimeException("Turtle: incorrect initial position " + aRow + ", " + aCol);

        }if (aDir < UP || LEFT < aDir){
            throw new RuntimeException("Turtle: incorrect initial direction " + aDir);
        }
        row = aRow;
        col = aCol;
        dir = aDir;
    }
    public void penDown(){
        isPenDown = true;
    }
    public void penUp(){
        isPenDown = true;
    }
    public void turnLeft(){
        --dir;
        if (dir == -1){
            dir = LEFT;
        }
    }
    public void turnRight(){
        ++dir;
        if (dir == 4){
            dir = UP;
        }
    }
    void move(int d){
        for (int i = 0; i < d; ++i){
            if (isPenDown){
                field.set(row, col);
            }
            switch (dir){
                case UP:
                --row;
                break;
                case RIGHT:
                    ++col;
                    break;

                case DOWN:
                    ++row;
                    break;
                case LEFT:
                    --col;
                    break;
            }
            if (!field.inRange(row, col)){
                throw new RuntimeException("Turtle is out of the field: " + row + "," + col);
            }
        }
    }
}
