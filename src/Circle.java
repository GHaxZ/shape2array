public class Circle implements Shape{

    private int radius;
    private char[][] shape;

    public Circle(int radius) {
        this.radius = radius;
        createShape();
    }

    private void createShape(){
        int size = 2 * radius + 1;
        shape = new char[size][size];
        int centerX = radius;
        int centerY = radius;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int x = i - centerX;
                int y = j - centerY;
                double distance = Math.sqrt(x * x + y * y);
                if (distance <= radius) {
                    shape[i][j] = 1;
                }
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
