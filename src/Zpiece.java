import java.awt.*;

public class Zpiece extends Block{
    private Point[][] rotIndexZ;
    private Point curentLoc;
    private Color color;

    public Zpiece(int x, int y){
        super(x,y,Color.red);

        //here's where we hardcode coordinates...
        for (int i = 0; i < 2; i += 2) {
            rotIndexZ[i][0] = new Point(0, 0);
            rotIndexZ[i][1] = new Point(0, 1);
            rotIndexZ[i][2] = new Point(1, 1);
            rotIndexZ[i][3] = new Point(1, 2);
        }

        for (int i = 1; i < 2; i += 2) {
            rotIndexZ[i][0] = new Point(0, 1);
            rotIndexZ[i][1] = new Point(1, 1);
            rotIndexZ[i][2] = new Point(1, 0);
            rotIndexZ[i][3] = new Point(2, 0);
        }
    }

}
