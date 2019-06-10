import com.sun.java.swing.action.ExitAction;

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
        for (Point p : rotations[(rotind+1)%4]) {
            if (curentLoc.x+p.x>=Main.board.length||curentLoc.x+p.x<0) {
                return;
            }
        }
        for(Point p : rotations[rotind]){
            Main.board[curentLoc.x+p.x][curentLoc.y+p.y].setColor(Color.BLACK);
        }
        rotind = (rotind+1)%4;
    }

    public void moveRight(){
        for (Point p : rotations[rotind]) {
            if (curentLoc.x+1+p.x >= Main.board.length) {
                return;
            }
        }
        for (Point p : rotations[rotind]) {
            Main.board[curentLoc.x + p.x][curentLoc.y + p.y].setColor(Color.BLACK);
        }
        curentLoc.x++;
    }

    public void moveLeft(){
        for (Point p : rotations[rotind]) {
            if (curentLoc.x+p.x<1) {
                return;
            }
        }
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
        for(int i = 0; i < 4; i++){
            //if it hits the bottom
            if(curentLoc.y+rotations[rotind][i].y>16) {
                isLive = false;
                return true;
            }
            //if the cell below is not open
            if(Main.board[curentLoc.x+rotations[rotind][i].x][curentLoc.y+rotations[rotind][i].y+1].getColor()!=Color.black){
                //if the cell below is not one of the three other cells in the piece
                if(Main.board[curentLoc.x+rotations[rotind][i].x][curentLoc.y+rotations[rotind][i].y+1]!=
                        Main.board[curentLoc.x+rotations[rotind][(i+1)%4].x][curentLoc.y+rotations[rotind][(i+1)%4].y]){
                    if(Main.board[curentLoc.x+rotations[rotind][i].x][curentLoc.y+rotations[rotind][i].y+1]!=
                            Main.board[curentLoc.x+rotations[rotind][(i+2)%4].x][curentLoc.y+rotations[rotind][(i+2)%4].y]){
                        if(Main.board[curentLoc.x+rotations[rotind][i].x][curentLoc.y+rotations[rotind][i].y+1]!=
                                Main.board[curentLoc.x+rotations[rotind][(i+3)%4].x][curentLoc.y+rotations[rotind][(i+3)%4].y]){
                            isLive = false;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
