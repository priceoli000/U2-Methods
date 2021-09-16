import javax.swing.*;
import java.text.DecimalFormat;
public class CircleCalc {


    public static void main(String[] args) {
        double radius = getInput("Please enter the radius");

       double area = area(radius);
       double perimeter = perimeter(radius);

       JOptionPane.showMessageDialog(null, displayResults(area, perimeter));

        area(radius);
        perimeter(radius);
        //create and run the program

    }

    public static double getInput(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));

    }

    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area (double radius){

        double area1 = (radius * Math.PI);
        return (Math.pow(area1, 2));
    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static double perimeter (double radius){

        return (2 * Math.PI * radius);
    }

    public static String displayResults(double area, double perimeter){
        DecimalFormat round = new DecimalFormat("#.##");
        String message = "The area is: " + round.format(area);
        message += "\nThe circumference is: " + round.format(perimeter);
        return message;
    }
}
