package cinemaHall;

import javax.swing.*;
import java.awt.*;

public class CinemaJFrame extends JFrame {
    private JPanel RecordsOfCinemaHall;
    private JPanel canvasJPanel;
    private JButton saveJButton;

    private CinemaHall cinemaHal = new CinemaHall();


    public static void main(String[] args) {

        CinemaJFrame cinemaJFrame = new CinemaJFrame();
        cinemaJFrame.setLocationRelativeTo(null);
        cinemaJFrame.setVisible(true);
        cinemaJFrame.setSize(500, 500);

    }

    public CinemaJFrame(){
        RecordsOfCinemaHall.setVisible(true);
        canvasJPanel.setVisible(true);
    }
}
