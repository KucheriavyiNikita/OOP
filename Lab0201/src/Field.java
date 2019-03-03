public class Field {
    int width;
    int height;
    char[][] data;


    public Field(int aWidth, int aHeight) {
        width = aWidth;
        height = aHeight;
        data = new char[aHeight][aWidth];
        if (aWidth < 1 || aHeight < 1) {
            throw new RuntimeException("field: incorrect height and width");
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                data[i][j] = '.';
            }
        }
    }
    public void print(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println();

        }
    }
    public void set(int row, int col){
        data[row][col] = '*';

    }
    public boolean inRange(int row, int col){
        if (row < 0 || height < row || col < 0 || width < col)

            return false;
        return true;

    }
}