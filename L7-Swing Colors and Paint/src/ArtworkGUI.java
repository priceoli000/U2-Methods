import sun.plugin.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    //DECLARE VARIABLES
    JFrame frame;
    Color background = new Color(135, 206, 250);
    Color skin = new Color(249, 228, 183);
    Color hair = new Color(255,100,100);
    Color shirt = new Color(150,75,0);

    public ArtworkGUI()
    {
        //CREATE THE GUI
        frame = new JFrame("Artwork");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();
        frame.add(panel);
        frame.setVisible(true);
    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(background);
        }

        //Add the PaintComponent Method and create your drawing.
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(skin);
            g.fillRect(100,200,200,200);
            g.fillRect(160, 400, 75, 30);

            g.setColor(hair);
            g.fillRect(110, 180, 180,20);
            g.fillRect(120, 160, 160, 20);

            g.setColor(Color.BLACK);
            g.fillRect(120, 230, 50, 50);
            g.fillRect(225, 230, 50,50);
            g.fillRect(135, 330, 120, 25);

            g.setColor(shirt);
            g.fillRect(90, 430, 220, 220);


        }

        {


        }
    }
}
