public class Field {
    private int width;
    private int height;
    private char[][] data;

    public Field(int aWidth, int aHeight){
        if (aWidth < 1|| aHeight < 1){
            throw new RuntimeException("Field: incorrect width of height");
        }
        width = aWidth;
        height = aHeight;
        data = new char[height][width];
        for (int i = 0; i < height; ++i){
            for (int j = 0; j < width; ++j){
                data[i][j] = '.';
            }
        }
    }
    public void print(){
        for (int i = 0; i < height; ++i){
            for (int j = 0; j < width; ++j){
                System.out.println(data[i][j]);
            }
            System.out.println();
        }
    }
    public void set(int row, int col){
        data[row][col] = '*';
    }
    public boolean inRange(int row, int col){
        return 0 <= row && row < height && 0 <= col && col < width;
    }
}
