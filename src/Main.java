import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * PORTER MOODY
 */
public class Main extends JPanel implements ActionListener, KeyListener, MouseListener{
    private Timer timer;
    private int pace, size, counter, movenum;
    public static Cell[][] board;
    private ArrayList<Block> pieces;
    private Block thePiece;

    public Main(int w, int h){
        setSize(w, h);


        //world.test();
        board = new Cell[10][18];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c] = new Cell(r,c);
            }
        }
        pieces = new ArrayList<Block>();
        size = 30;
        pace = 1000/60;
        timer = new Timer(pace, this);
        timer.start();
        counter = 0;
        movenum = 60;


        addKeyListener(this);
        addMouseListener(this);




        pieces.add(new Zpiece(0,3));
        thePiece = pieces.get(pieces.size()-1);
        thePiece.set();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;



        for(Cell[] r : board){
            for(Cell c : r) {
                c.draw(g2);
            }
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //thePiece = pieces.get(pieces.size()-1);
        thePiece.set();


//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                if(board[i][j].getColor()==Color.black)
//                    break;
//            }
//            for (int r = 0; r < i; r++) {
//                for (int c = 0; c < board[0].length; c++) {
//                    board[r+1][c] = board[r][c];
//                }
//            }
//        }
        if(thePiece.isAtBottom()){
            //Random piece at top
            int rand = (int)(Math.random()*7+1);
            System.out.println(rand);
            if(rand == 1) {
                Block b = new Zpiece(3, 0);
                pieces.add(b);
                thePiece = b;
            }
            if(rand == 2) {
                Block b = new RZpiece(3, 0);
                pieces.add(b);
                thePiece = b;
            }
            if(rand == 3) {
                Block b = new Lpiece(3, 0);
                pieces.add(b);
                thePiece = b;
            }
            if(rand == 4) {
                Block b = new RLpiece(3, 0);
                pieces.add(b);
                thePiece = b;
            }
            if(rand == 5) {
                Block b = new Ipiece(3, 0);
                pieces.add(b);
                thePiece = b;
            }
            if(rand == 6) {
                Block b = new Opiece(3, 0);
                pieces.add(b);
                thePiece = b;
            }
            if(rand == 7) {
                Block b = new Tpiece(0, 3);
                pieces.add(b);
                thePiece = b;
            }
        }
        if(counter==movenum){
//            Block b = thePiece.clone();
//            b.moveDown();
//            if(!b.isAtBottom()) {
                thePiece.moveDown();
                counter = 0;
//            }
        }

        counter++;

        repaint();


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            Block b = thePiece.clone();
            b.rotate();
            for(Block c : pieces.subList(0, pieces.size()-1)) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (c.getCurentLoc().x + c.rotations[c.getRotind()][i].x == b.getCurentLoc().x + b.rotations[b.getRotind()][j].x
                                &&c.getCurentLoc().y + c.rotations[c.getRotind()][i].y == b.getCurentLoc().y + b.rotations[b.getRotind()][j].y) {
                            return;
                        }
                    }
                }
            }
            thePiece.rotate();
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            thePiece.moveRight();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            thePiece.moveLeft();
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){

            Block b = thePiece.clone();
            b.moveDown();
            if (!thePiece.isAtBottom()) {
                thePiece.moveDown();
            }

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        int width = 800;
        int height = 800;
        frame.setPreferredSize(new Dimension(width, height + 24));

        JPanel panel = new Main(width, height);
        panel.setFocusable(true);
        panel.grabFocus();

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
