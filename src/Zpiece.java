import java.awt.*;

public class Zpiece extends Block{
    private Point[][] rotIndexZ;
    private Point curentLoc;
    private Color color;

    public Zpiece(int x, int y){
        super(x,y,Color.red);

        //here's where we hardcode coordinates...
        rotIndexZ[0][0] = new Point(0, 0);
        rotIndexZ[0][1] = new Point(0, 1);
        rotIndexZ[0][2] = new Point(1, 1);
        rotIndexZ[0][3] = new Point(1, 2);

        rotIndexZ[1][0] = new Point(0, 2);
        rotIndexZ[1][1] = new Point(1, 2);
        rotIndexZ[1][2] = new Point(1, 1);
        rotIndexZ[1][3] = new Point(2, 1);

        rotIndexZ[2][0] = new Point(0, 0);
        rotIndexZ[2][1] = new Point(0, 1);
        rotIndexZ[2][2] = new Point(1, 1);
        rotIndexZ[2][3] = new Point(1, 2);

        rotIndexZ[3][0] = new Point(0, 1);
        rotIndexZ[3][1] = new Point(1, 1);
        rotIndexZ[3][2] = new Point(1, 0);
        rotIndexZ[3][3] = new Point(2, 0);

    }

}
