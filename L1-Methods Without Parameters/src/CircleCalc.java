import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {

        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius of your circle?"));

        area(radius);

        circumference(radius);

    System.exit(0);
}

    public static void area(double radius){
        DecimalFormat round = new DecimalFormat("#.##");
        double area = Math.pow(radius, 2) * Math.PI;
        JOptionPane.showMessageDialog(null, "The area of your circle is " + round.format(area));

    }
        //call the circumference method
    public static void circumference(double radius){
        DecimalFormat round = new DecimalFormat("#.##");
        double circumference = (radius * Math.PI) * 2;
        JOptionPane.showMessageDialog(null, "The circumference is " + round.format(circumference));
    }
    }

    //write a method to calculate a circle's area


    //write a method to calculate a circle's circumference

