import java.awt.*;

public class RZpiece extends Block{
    private Point[][] rotIndexrZ;
    private Point curentLoc;
    private Color color;

    public RZpiece(int x, int y){
        super(x,y,Color.GREEN);

        //here's where we hardcode coordinates...
        for (int i = 0; i < 2; i += 2) {
            rotIndexrZ[i][0] = new Point(1, 0);
            rotIndexrZ[i][1] = new Point(1, 1);
            rotIndexrZ[i][2] = new Point(0, 1);
            rotIndexrZ[i][3] = new Point(0, 2);
        }

        for (int i = 1; i < 2; i += 2) {
            rotIndexrZ[i][0] = new Point(0, 0);
            rotIndexrZ[i][1] = new Point(1, 0);
            rotIndexrZ[i][2] = new Point(1, 1);
            rotIndexrZ[i][3] = new Point(2, 1);
    }

}