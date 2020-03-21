package cinemaHall;

import java.awt.*;

class CinemaHall {
    private boolean[][] chairs = new boolean[30][15];
    private static final int HEIGHT = 16;
    private static final int SPACE = 2;

    public void print(Graphics g)
    {
        for (int j = 0; j < chairs[0].length; j++)
        {
            for (int i = 0; i < chairs.length; i++)
            {
                if (chairs[i][j])
                    g.setColor(Color.RED);
                else
                    g.setColor(Color.GREEN);
                g.fillRect(i * (HEIGHT + SPACE), j * (HEIGHT + SPACE), HEIGHT, HEIGHT);
            }
        }
    }
}
