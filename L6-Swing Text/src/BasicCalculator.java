import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    static JTextField inputField1, inputField2;
    static JLabel resultLabel;

    public static void main(String[] args) {
        JFrame window = new JFrame("Basic Calculator");
        JPanel panel = new JPanel();
        JLabel inputLabel1 = new JLabel("Enter a number: ");
        JLabel inputLabel2 = new JLabel("Enter a number: ");
        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);

        JButton addBtn = new JButton("Add");
        JButton subBtn = new JButton("Subtract");
        JButton multBtn = new JButton("Multiply");
        JButton divBtn = new JButton ("Divide");

        resultLabel = new JLabel("0.00");

        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addBtn.addActionListener(new addListener());
        subBtn.addActionListener(new subListener());
        multBtn.addActionListener(new multListener());
        divBtn.addActionListener(new divListener());


        panel.add(inputLabel1);
        panel.add(inputField1);
        panel.add(inputLabel2);
        panel.add(inputField2);

        panel.add(resultLabel);

        panel.add(addBtn);
        panel.add(subBtn);
        panel.add(multBtn);
        panel.add(divBtn);

        window.add(panel);

        window.setLocationRelativeTo(null);

        window.setVisible(true);
    }

    private static class addListener implements ActionListener{

        /* 1. Get Input - from the Text Field
           2. Add the numbers
           3. Output to the result Label
        */

        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(number1 + number2));
        }
    }
    private static class subListener implements ActionListener{

        /* 1. Get Input - from the Text Field
           2. Add the numbers
           3. Output to the result Label
        */

        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(number1 - number2));
        }
    }


    private static class multListener implements ActionListener{

        /* 1. Get Input - from the Text Field
           2. Add the numbers
           3. Output to the result Label
        */

        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(number1 * number2));
        }
    }

    private static class divListener implements ActionListener{

        /* 1. Get Input - from the Text Field
           2. Add the numbers
           3. Output to the result Label
        */

        public void actionPerformed(ActionEvent e) {
            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());

            resultLabel.setText(String.valueOf(number1 / number2));
        }
    }
}




