import java.awt.*;

public class Ipiece extends Block{
    //private Point[][] rotations;
//    private Point curentLoc;
//    private Color color;
//    private int rotind;
//    private boolean isLive;
//not finished
    public Ipiece(int x, int y){
        super(x,y,new Color(72, 228, 233));

        //here's where we hardcode coordinates...
        rotations[0][0] = new Point(0, 0);
        rotations[0][1] = new Point(0, 1);
        rotations[0][2] = new Point(0, 2);
        rotations[0][3] = new Point(0, 3);

        rotations[1][0] = new Point(0, 2);
        rotations[1][1] = new Point(1, 2);
        rotations[1][2] = new Point(2, 2);
        rotations[1][3] = new Point(3, 2);

        rotations[2][0] = new Point(0, 0);
        rotations[2][1] = new Point(0, 1);
        rotations[2][2] = new Point(0, 2);
        rotations[2][3] = new Point(0, 3);

        rotations[3][0] = new Point(0, 1);
        rotations[3][1] = new Point(1, 1);
        rotations[3][2] = new Point(2, 1);
        rotations[3][3] = new Point(3, 1);
    }

//    @Override
//    public boolean isAtBottom() {
//        for(Point p : rotations[rotind]){
//            if(curentLoc.y+p.y>15) {
//                isLive = false;
//                return true;
//            }
//        }
//        return false;
//    }

}