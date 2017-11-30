package screensaver;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@org.springframework.stereotype.Component
public abstract class ColorFrame extends JFrame {

    //@Autowired
    //private ApplicationContext context;
    //private Color color;

    protected abstract Color getColor();

    public ColorFrame (){
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace(){
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(700));
        getContentPane().setBackground(getColor());
        repaint();
    }
}
