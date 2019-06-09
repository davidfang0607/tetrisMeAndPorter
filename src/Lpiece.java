import java.awt.*;

public class Lpiece extends Block{
    private Point[][] rotIndexL;
    private Point curentLoc;
    private Color color;

    public Lpiece(int x, int y){
        super(x,y,Color.blue);

        //here's where we hardcode coordinates...
        rotIndexL[0][0] = new Point(0, 2);
        rotIndexL[0][1] = new Point(1, 2);
        rotIndexL[0][2] = new Point(1, 1);
        rotIndexL[0][3] = new Point(1, 0);

        rotIndexL[1][0] = new Point(0, 1);
        rotIndexL[1][1] = new Point(1, 1);
        rotIndexL[1][2] = new Point(2, 1);
        rotIndexL[1][3] = new Point(2, 2);

        rotIndexL[2][0] = new Point(0, 2);
        rotIndexL[2][1] = new Point(0, 1);
        rotIndexL[2][2] = new Point(0, 0);
        rotIndexL[2][3] = new Point(1, 0);

        rotIndexL[3][0] = new Point(0, 0);
        rotIndexL[3][1] = new Point(0, 1);
        rotIndexL[3][2] = new Point(1, 1);
        rotIndexL[3][3] = new Point(2, 1);
    }

}