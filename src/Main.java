import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * PORTER MOODY
 */
public class Main extends JPanel implements ActionListener, KeyListener, MouseListener{
    private Timer timer;
    private int pace, size;
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
        pace = 100;
        timer = new Timer(pace, this);
        timer.start();


        addKeyListener(this);
        addMouseListener(this);




        pieces.add(new Zpiece(3,0));
        thePiece = pieces.get(pieces.size()-1);
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
        for(Block p : pieces){
           p.set();
        }

        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            thePiece.rotate();
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            thePiece.moveRight();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            thePiece.moveLeft();
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            thePiece.moveDown();
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
