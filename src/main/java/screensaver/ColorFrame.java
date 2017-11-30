package screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@org.springframework.stereotype.Component
public class ColorFrame extends JFrame {

    @Autowired
    private ApplicationContext context;
    //private Color color;


    public ColorFrame (){
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace(){
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(700));
        getContentPane().setBackground(context.getBean(Color.class));
        repaint();
    }
}
