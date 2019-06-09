import java.awt.*;

public class Block {

    public Point[][] rotations;
    private Point curentLoc;
    private int rotind;
    private Color color;

    public Block(int x, int y, Color color){
        rotations = new Point[4][4];
        curentLoc = new Point(x,y);
        rotind = 0;
        this.color = color;
    }


    public void set(){
        for(Point p : rotations[rotind]){
            Main.board[curentLoc.x+p.x][curentLoc.y+p.y].setColor(color);
        }
    }

    public void rotate(){
        for(Point p : rotations[rotind]){
            Main.board[curentLoc.x+p.x][curentLoc.y+p.y].setColor(color);
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
}
