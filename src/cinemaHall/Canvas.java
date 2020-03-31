package cinemaHall;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    private CinemaHall cinemaHa;

    public Canvas(CinemaHall cinemaHal) {
        super();
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(400, 300));
        this.cinemaHa = cinemaHal;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        cinemaHa.printing(g);
    }
}
