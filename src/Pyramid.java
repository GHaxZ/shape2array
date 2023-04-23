public class Pyramid implements Shape{
    private int width;
    private boolean flipped = false;
    private char[][] shape;

    public Pyramid(int width) {
        this.width = width;
        createPyramid();
    }

    public Pyramid(int width, boolean flipped) {
        this.width = width;
        this.flipped = flipped;
        createPyramid();
    }

    private void createPyramid(){
        shape = new char[(int)Math.ceil(width/2f)][width];

        if(flipped){
            int k = 0, row = 0;

            while(width >= 1){
                for(int x = 0; x < width; x++){
                    shape[row][k + x] = 1;
                }

                width -= 2;
                row++;
                k++;
            }
        } else {
            int k = (width % 2 == 0) ? width/2 -1 : width/2, row = 0, j = (width % 2 == 0) ? 2 : 1;

            while(j <= width){
                for(int x = 0; x < j; x++){
                    shape[row][k + x] = 1;
                }

                j += 2;
                row++;
                k--;
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
