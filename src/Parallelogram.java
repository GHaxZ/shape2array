public class Parallelogram implements Shape{
    private int height;
    private int width;
    private char[][] shape;

    public Parallelogram(int height, int width) {
        this.height = height;
        this.width = width;
        createShape();
    }

    private void createShape() {
        int k = height - 1;
        int row = 0;
        shape = new char[height][width + k];

        for(int x = 0; x < height; x++){
            for(int y = k; y < width + k; y++){
                shape[row][y] = 1;
            }
            k--;
            row++;
        }
    }

    @Override
    public void printShape() {
        for(int i = 0; i < shape.length; i++){
            for(int j = 0; j < shape[i].length; j++){
                System.out.print((shape[i][j] == 0) ? "⬜" : "⬛");
            }
            System.out.println();
        }
    }
}
