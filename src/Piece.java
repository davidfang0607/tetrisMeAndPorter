import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;

import java.awt.*;


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
    private int x, y, z;
    private Color color;




    public Piece() {
        this.curentLoc = new Point(x, y);
        this.rotIndexZ = new Point[4][4];
        this.rotIndexL = new Point[4][4];
        this.rotIndexrZ = new Point[4][4];
        this.rotIndexrL = new Point[4][4];
        this.rotIndexT = new Point[4][4];
        this.rotIndexI = new Point[4][4];
        this.rotIndexO = new Point[4][4];


        for (int i = 0; i < 3; i++) {
            rotIndexO[i][0] = new Point(0, 0);
            rotIndexO[i][1] = new Point(0, 1);
            rotIndexO[i][2] = new Point(1, 0);
            rotIndexO[i][3] = new Point(1, 1);
        }


        //Z
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


        //rZ
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


        //L
        rotIndexL[0][0] = new Point(0, 0);
        rotIndexL[0][1] = new Point(1, 0);
        rotIndexL[0][2] = new Point(2, 0);
        rotIndexL[0][3] = new Point(2, 1);

        rotIndexL[1][0] = new Point(1, 0);
        rotIndexL[1][1] = new Point(0, 0);
        rotIndexL[1][2] = new Point(0, 1);
        rotIndexL[1][3] = new Point(0, 2);

        rotIndexL[2][0] = new Point(0, 0);
        rotIndexL[2][1] = new Point(0, 1);
        rotIndexL[2][2] = new Point(1, 1);
        rotIndexL[2][3] = new Point(2, 2);

        rotIndexL[3][0] = new Point(0, 0);
        rotIndexL[3][1] = new Point(1, 0);
        rotIndexL[3][2] = new Point(1, 1);
        rotIndexL[3][3] = new Point(1, 2);
    }
}
