import java.awt.*;

public class Opiece extends Block{
    private Point[][] rotIndexO;
    private Point curentLoc;
    private Color color;

    public Opiece(int x, int y){
        super(x,y,Color.YELLOW);

        //here's where we hardcode coordinates...
        for (int i = 0; i < 3; i++) {
            rotIndexO[i][0] = new Point(0, 0);
            rotIndexO[i][1] = new Point(0, 1);
            rotIndexO[i][2] = new Point(1, 0);
            rotIndexO[i][3] = new Point(1, 1);
        }
    }

}