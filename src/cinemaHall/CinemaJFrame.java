package cinemaHall;

import javax.swing.*;


public class CinemaJFrame extends JFrame {
    private JPanel RecordsOfCinemaHall;

    private CinemaHall cinemaHal = new CinemaHall();


    public static void main(String[] args) {
        CinemaJFrame cinema = new CinemaJFrame();
        cinema.setVisible(true);


    }

    public CinemaJFrame(){
        this.setLocationRelativeTo(null);
        this.setTitle("Cinema hall");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas(cinemaHal);
        this.add(canvas);

        this.pack();
    }
    
}
