import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    JFrame window;
    JPanel panel;
    JButton colorChg1;
    JButton colorChg2;
    JButton colorChg3;

    Color color1 = new Color(0, 0, 0);
    Color color2 = new Color(21, 0, 80);
    Color color3 = new Color(97, 0, 113);


    public ColorSwitchGUI(){
        //create your GUI
        window = new JFrame("Color Switch");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,200);
        window.setLocationRelativeTo(null);

        panel = new JPanel();

        colorChg1 = new JButton("Change the colors!");
        colorChg2 = new JButton("Change the colors!");
        colorChg3 = new JButton("Change the colors!");

        colorChg1.addActionListener(new ColorChanger1());
        colorChg2.addActionListener(new ColorChanger2());
        colorChg3.addActionListener(new ColorChanger3());

        window.add(panel);
        panel.add(colorChg1);
        panel.add(colorChg2);
        panel.add(colorChg3);

        window.setVisible(true);
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
    private class ColorChanger1 implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(color2);
            colorChg1.setForeground(color3);
            colorChg1.setBackground(color1);
        }
    }

    private class ColorChanger2 implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(color3);
            colorChg2.setForeground(color2);
            colorChg2.setBackground(color1);
        }
    }

    private class ColorChanger3 implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){
            panel.setBackground(color1);
            colorChg3.setForeground(color2);
            colorChg3.setBackground(color3);
        }
    }

}
