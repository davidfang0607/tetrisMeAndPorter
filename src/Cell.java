import java.awt.*;

public class Cell {

    private Color color;
    private int row, col, size;

    public Cell(int x, int y){
        this.row = x;
        this.col = y;
        size = 30;
    }

    public void draw(Graphics2D g2) {
        if(color == Color.YELLOW)
            g2.setColor(color);
            g2.drawRect(row * size, col * size, size, size);
        if(color == Color.blue)
            g2.setColor(color);
        g2.drawRect(row * size, col * size, size, size);
        if(color == Color.red)
            g2.setColor(color);
        g2.drawRect(row * size, col * size, size, size);
        if(color == Color.orange)
            g2.setColor(color);
        g2.drawRect(row * size, col * size, size, size);
        if(color == Color.green)
            g2.setColor(color);
        g2.drawRect(row * size, col * size, size, size);
        if(color == new Color(235, 80, 230))
            g2.setColor(color);
        g2.drawRect(row * size, col * size, size, size);
        if(color == new Color(72, 228, 233))
            g2.setColor(color);
        g2.drawRect(row * size, col * size, size, size);
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
