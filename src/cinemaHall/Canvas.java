package cinemaHall;

import javax.swing.*;
import java.awt.Graphics;

public class Canvas extends JPanel {
    private CinemaHall cinemaHal;

    public Canvas(CinemaHall cinemaHal) {
        super();
        this.cinemaHal = cinemaHal;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        cinemaHal.printing(g);
    }
}
