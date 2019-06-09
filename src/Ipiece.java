import java.awt.*;

public class Ipiece extends Block{
    private Point[][] rotIndexI;
    private Point curentLoc;
    private Color color;
//not finished
    public Ipiece(int x, int y){
        super(x,y,new Color(72, 228, 233));

        //here's where we hardcode coordinates...
        rotIndexI[0][0] = new Point(0, 0);
        rotIndexI[0][1] = new Point(1, 0);
        rotIndexI[0][2] = new Point(2, 0);
        rotIndexI[0][3] = new Point(2, 1);

        rotIndexI[1][0] = new Point(1, 0);
        rotIndexI[1][1] = new Point(0, 0);
        rotIndexI[1][2] = new Point(0, 1);
        rotIndexI[1][3] = new Point(0, 2);

        rotIndexI[2][0] = new Point(0, 0);
        rotIndexI[2][1] = new Point(0, 1);
        rotIndexI[2][2] = new Point(1, 1);
        rotIndexI[2][3] = new Point(2, 2);

        rotIndexI[3][0] = new Point(0, 0);
        rotIndexI[3][1] = new Point(1, 0);
        rotIndexI[3][2] = new Point(1, 1);
        rotIndexI[3][3] = new Point(1, 2);
    }

}