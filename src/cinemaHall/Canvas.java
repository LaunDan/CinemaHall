package cinemaHall;

import javax.swing.*;
import java.awt.Graphics;

public class Canvas extends JPanel {
    private CinemaHall cinemaHa;

    public Canvas(CinemaHall cinemaHal) {
        super();
        this.cinemaHa = cinemaHal;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        cinemaHa.printing(g);
    }
}
