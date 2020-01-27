import javax.swing.*;
import java.awt.*;

public class SimpleGUIRunner
{
    public static void main(String[] args)
    {
        //1. Create the frame.
        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(255, 255, 0));
        yellowLabel.setPreferredSize(new Dimension(200, 180));

        JMenuBar topBar = new JMenuBar();

        JMenu m2 = new JMenu();

        topBar.add(m2);
        
        JFrame frame = new JFrame("Bruh");

        frame.setJMenuBar(topBar);

        //2. Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //3. Create components and put them in the frame.
        //...create emptyLabel...
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
        frame.getContentPane().add(topBar, BorderLayout.NORTH);

        //4. Size the frame.
        frame.pack();

        //5. Show it.
        frame.setVisible(true);;
    }
}
