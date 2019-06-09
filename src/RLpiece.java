import java.awt.*;

public class RLpiece extends Block{
    private Point[][] rotIndexrL;
    private Point curentLoc;
    private Color color;

    public RLpiece(int x, int y){
        super(x,y,Color.orange);

        //here's where we hardcode coordinates...
        rotIndexrL[0][0] = new Point(0, 1);
        rotIndexrL[0][1] = new Point(1, 1);
        rotIndexrL[0][2] = new Point(2, 1);
        rotIndexrL[0][3] = new Point(2, 0);

        rotIndexrL[1][0] = new Point(0, 0);
        rotIndexrL[1][1] = new Point(1, 0);
        rotIndexrL[1][2] = new Point(1, 1);
        rotIndexrL[1][3] = new Point(1, 2);

        rotIndexrL[2][0] = new Point(0, 1);
        rotIndexrL[2][1] = new Point(0, 0);
        rotIndexrL[2][2] = new Point(1, 0);
        rotIndexrL[2][3] = new Point(2, 0);

        rotIndexrL[3][0] = new Point(0, 0);
        rotIndexrL[3][1] = new Point(0, 1);
        rotIndexrL[3][2] = new Point(0, 2);
        rotIndexrL[3][3] = new Point(1, 2);
    }

}