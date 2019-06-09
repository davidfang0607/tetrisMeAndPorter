import java.awt.*;

public class RZpiece extends Block{
    private Point[][] rotIndexrZ;
    private Point curentLoc;
    private Color color;

    public RZpiece(int x, int y){
        super(x,y,Color.GREEN);

        //here's where we hardcode coordinates...
        rotIndexrZ[0][0] = new Point(0, 2);
        rotIndexrZ[0][1] = new Point(0, 1);
        rotIndexrZ[0][2] = new Point(1, 1);
        rotIndexrZ[0][3] = new Point(1, 0);

        rotIndexrZ[1][0] = new Point(0, 1);
        rotIndexrZ[1][1] = new Point(1, 1);
        rotIndexrZ[1][2] = new Point(1, 2);
        rotIndexrZ[1][3] = new Point(2, 2);

        rotIndexrZ[2][0] = new Point(0, 2);
        rotIndexrZ[2][1] = new Point(0, 1);
        rotIndexrZ[2][2] = new Point(1, 1);
        rotIndexrZ[2][3] = new Point(1, 0);

        rotIndexrZ[3][0] = new Point(0, 0);
        rotIndexrZ[3][1] = new Point(1, 0);
        rotIndexrZ[3][2] = new Point(1, 1);
        rotIndexrZ[3][3] = new Point(2, 1);

    }
}