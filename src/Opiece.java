import java.awt.*;

public class Opiece extends Block{
    //private Point[][] rotations;
    private Point curentLoc;
    private Color color;

    public Opiece(int x, int y){
        super(x,y,Color.YELLOW);

        //here's where we hardcode coordinates...
        for (int i = 0; i < 4; i++) {
            rotations[i][0] = new Point(0, 0);
            rotations[i][1] = new Point(0, 1);
            rotations[i][2] = new Point(1, 0);
            rotations[i][3] = new Point(1, 1);
        }
    }

}