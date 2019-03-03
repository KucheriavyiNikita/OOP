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

    public Turtle(Field aField, int aRow, int aCol, int aDir) {
        field = aField;
        row = aRow;
        col = aCol;
        dir = aDir;
    }

    public void penDown() {
        isPenDown = true;
    }

    public void move(int d) {
        for (int i = 0; i < d; i++) {
            if (isPenDown) {
                // field.set(row, col);
                field.data[row][col] = '*';
            }
            switch (dir) {
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
        }
    }
}