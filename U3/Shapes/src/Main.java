import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*

            1. Paint component

            2. Update and draw methods

            3. yap

            4. JFrame, JPanel class, add panel, frame visible

            5. -----

            6. RED, YELLOW, BLUE, ORANGE, PINK, CYAN, MAGENTA, GREEN, BLACK, WHITE, GRAY, LIGHT_GRAY, and DARK_GRAY

            7. Colour name = new Colour (R,G,B);

            8.

         */

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);


        drawPanel dp = new drawPanel();

        frame.add(dp);
        frame.pack();
        frame.setVisible(true);
    }
}