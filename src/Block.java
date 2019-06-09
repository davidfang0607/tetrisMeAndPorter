import java.awt.*;

public class Block {

    protected Point[][] rotations;
    private Point curentLoc;
    private int rotind;
    private Color color;
    private boolean isLive;

    public Block(int x, int y, Color color){
        rotations = new Point[4][4];
        curentLoc = new Point(x,y);
        rotind = 0;
        this.color = color;
        isLive = true;
        //assign();
    }


//    public void assign(Point[][] arr){
//        for (int r = 0; r < 4; r++) {
//            for (int c = 0; c < 4; c++) {
//                rotations[r][c] = arr[r][c];
//            }
//        }
//    }

    public void set(){
        for(Point p : rotations[rotind]){
            Main.board[curentLoc.x+p.x][curentLoc.y+p.y].setColor(color);
        }
    }

    public void rotate(){
        for(Point p : rotations[rotind]){
            Main.board[curentLoc.x+p.x][curentLoc.y+p.y].setColor(Color.BLACK);
        }
        rotind = (rotind+1)%4;
    }

    public void moveRight(){
        for(Point p : rotations[rotind]){
            Main.board[curentLoc.x+p.x][curentLoc.y+p.y].setColor(Color.BLACK);
        }
        curentLoc.x++;
    }

    public void moveLeft(){
        for(Point p : rotations[rotind]){
            Main.board[curentLoc.x+p.x][curentLoc.y+p.y].setColor(Color.BLACK);
        }
        curentLoc.x--;
    }

    public void moveDown(){
        for(Point p : rotations[rotind]){
            Main.board[curentLoc.x+p.x][curentLoc.y+p.y].setColor(Color.BLACK);
        }
        curentLoc.y++;
    }

    public boolean isAtBottom() {
        for(Point p : rotations[rotind]){
            if(curentLoc.y+p.y>16) {
                isLive = false;
                return true;
            }
        }
        return false;
    }
}
