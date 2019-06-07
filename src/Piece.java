import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;

public class Piece {
//    private Cell[][] cells;
    private Point[][] rotIndexZ;
    private Point[][] rotIndexrZ;
    private Point[][] rotIndexL;
    private Point[][] rotIndexrL;
    private Point[][] rotIndexT;
    private Point[][] rotIndexI;
    private Point[][] rotIndexO;
    private Point curentLoc;
    private int x, y;
    private Color color;




    public Piece(){
        this.curentLoc = new Point(x, y);
        this.rotIndexZ = new Point[4][4];
        this.rotIndexrZ = new Point[4][4];
        this.rotIndexrL = new Point[4][4];
        this.rotIndexT = new Point[4][4];
        this.rotIndexI = new Point[4][4];
        this.rotIndexO = new Point[4][4];
        this.rotIndexL = new Point[4][4];


    }

}
