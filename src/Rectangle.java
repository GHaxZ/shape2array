public class Rectangle implements Shape{

    private int height;
    private int width;
    private char[][] shape;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        createShape();
    }

    private void createShape() {
        shape = new char[height][width];
        for (int i = 0; i < shape.length; i++) {
            for(int j = 0; j < shape[i].length; j++){
                shape[i][j] = 1;
            }
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
