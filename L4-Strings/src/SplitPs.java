import javax.swing.*;

public class SplitPs {

    // 1. Get input - a word
    // 2. Isolate the p
    // 3. Isolate the three letters after the p
    // 4. output
    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

   "Hippopotamus" -> ppop
     */
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word that has a p, and three letters after it");
        JOptionPane.showMessageDialog(null, splitP(word));
        System.exit(0);
    }

    public static String splitP(String word){
        int pIndex = word.indexOf('p');

        String split = word.substring(pIndex + 1, pIndex + 4);

        return split;
    }

}
