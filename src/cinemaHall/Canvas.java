package cinemaHall;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    private CinemaHall cinemaHa;
    private CinemaJFrame cinema;

    public Canvas(CinemaHall cinemaHal) {
        super();
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(600, 300));
        this.cinemaHa = cinemaHal;
        JButton button = new JButton();

        this.add(button);
        

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = this.getWidth();
        int height = this.getHeight();

        cinemaHa.printing(g);
    }
}
