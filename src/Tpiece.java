import java.awt.*;

public class Tpiece extends Block{
    private Point[][] rotIndexT;
    private Point curentLoc;
    private Color color;

    public Tpiece(int x, int y){
        super(x,y,new Color(235, 80, 230));

        //here's where we hardcode coordinates...
        rotIndexT[0][0] = new Point(0, 1);
        rotIndexT[0][1] = new Point(1, 0);
        rotIndexT[0][2] = new Point(1, 1);
        rotIndexT[0][3] = new Point(1, 2);

        rotIndexT[1][0] = new Point(0, 0);
        rotIndexT[1][1] = new Point(1, 0);
        rotIndexT[1][2] = new Point(1, 1);
        rotIndexT[1][3] = new Point(2, 0);

        rotIndexT[2][0] = new Point(0, 0);
        rotIndexT[2][1] = new Point(0, 1);
        rotIndexT[2][2] = new Point(0, 2);
        rotIndexT[2][3] = new Point(1, 1);

        rotIndexT[3][0] = new Point(0, 2);
        rotIndexT[3][1] = new Point(1, 1);
        rotIndexT[3][2] = new Point(1, 2);
        rotIndexT[3][3] = new Point(2, 1);
    }

}