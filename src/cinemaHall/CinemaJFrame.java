package cinemaHall;

import javax.swing.*;
import java.awt.*;

public class CinemaJFrame extends JFrame {
    private JPanel RecordsOfCinemaHall;
    private JPanel canvasJPanel;
    private JButton saveJButton;

    private CinemaHall cinemaHal = new CinemaHall();


    public static void main(String[] args) {
        JFrame frame = new CinemaJFrame();

    }

    public CinemaJFrame(){

    }
}
