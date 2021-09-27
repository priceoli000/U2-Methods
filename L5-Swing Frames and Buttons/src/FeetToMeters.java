import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */
        /*
        1. Create GUI
        2. Get input, when a button is clicked
        3. The math
        4. Display results
         */
    public static void main(String[] args) {

            JFrame window = new JFrame("Feet To Meters");
            JPanel panel = new JPanel();
            JButton ftToMt = new JButton("Convert feet distance to meters.");
            JButton mtToFt = new JButton("Convert meters distance to feet.");


            window.setSize(350, 100);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setLocationRelativeTo(null);

            ftToMt.addActionListener(new feetToMetersListener());
            mtToFt.addActionListener(new metersToFeet());

            panel.add(ftToMt);
            panel.add(mtToFt);
            window.add(mtToFt);

            window.setVisible(true);


        }

        private static class feetToMetersListener implements ActionListener {

            public void actionPerformed(ActionEvent e){

                double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the feet"));

                double result = number / 3.28;

                JOptionPane.showMessageDialog(null, result + " in meters.");

            }

        }
    private static class metersToFeet implements ActionListener {

        public void actionPerformed(ActionEvent e){

            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the meters"));

            double result = number * 3.28;

            JOptionPane.showMessageDialog(null, result + " in feet.");

        }

    }
    }
