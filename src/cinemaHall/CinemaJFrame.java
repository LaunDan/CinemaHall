package cinemaHall;

import javax.swing.*;


public class CinemaJFrame extends JFrame {
    private JPanel RecordsOfCinemaHall;
    private JPanel canvasJPanel;
    private JButton saveJButton;

    private CinemaHall cinemaHal = new CinemaHall();



    public static void main(String[] args) {
        JFrame frame = new CinemaJFrame();
        frame.setTitle("Cinema hall");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    public CinemaJFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RecordsOfCinemaHall);

        this.pack();
    }
    
}
