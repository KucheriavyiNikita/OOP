public class Main {
    static final int H = 20;
    static final int W = 20;
    static final char[][] field = new char[H][W];
    static final int RIGHT = 1;
    static int turtleDir = RIGHT;
    static final int DOWN = 2;
    static final int LEFT = 3;
    static final int UP = 0;
    static boolean turtlePenDown = false;
    static int Pen = 0;
    static int Col = 0;
    static int Row = 0;

    public static void main(String[] args) {
        init();
        PenDown();
        move(10);
        TurnRight();
        move(10);
        TurnRight();
        move(10);
        TurnRight();
        move(10);
        print();
    }

    private static void PenDown() {
        --Pen;
        if (Pen == -1) {
            turtlePenDown = true;
        }
        if (Pen < -1) {
            Pen = -1;
        }
    }

    private static void PenUp() {
        ++Pen;
        if (Pen == 0) {
            turtlePenDown = false;
        }
        if (Pen > 0) {
            Pen = 0;
        }
    }

    private static void move(int d) {
        for (int i = 0; i < d - 1; i++) {
            if (turtlePenDown) {
                switch (turtleDir) {
                    case RIGHT:
                        field[Row][Col] = '*';
                        ++Col;
                        break;
                    case LEFT:
                        field[Row][Col] = '*';
                        --Col;
                        break;
                    case DOWN:
                        field[Row][Col] = '*';
                        ++Row;
                        break;
                    case UP:
                        field[Row][Col] = '*';
                        --Row;
                        break;
                }
            }
            else {
                switch (turtleDir) {
                    case RIGHT:
                        ++Col;
                        break;
                    case LEFT:
                        --Col;
                        break;
                    case DOWN:
                        ++Row;
                        break;
                    case UP:
                        --Row;
                        break;
                }
            }

        }
    }
    private static void TurnRight() {
        ++turtleDir;
        if (turtleDir == 4) {
            turtleDir = 0;
        }
    }
    private static void TurnLeft() {
        --turtleDir;
        if (turtleDir == -1) {
            turtleDir = 3;
        }
    }


    public static void init() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                field[i][j] = '.';
            }
        }
    }

    public static void print() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}