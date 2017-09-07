package cinemaClient;

import javax.swing.JFrame;

public class BookMovie {
    
    private static final int frameWidth = 595;
    private static final int frameHeight = 480;
    
    private static final String TITEL = "Cinema Booking";
    private static final String VERSIE = "0.1";

    public static void main(String[] args) {
        BookMovie bm = new BookMovie();
    }
    
    public BookMovie() {
        ClientFrame client = new ClientFrame();
        client.setTitle(TITEL + " " + VERSIE);

        client.setSize(frameWidth, frameHeight);

        client.setResizable(false);
        client.setVisible(true);
        
        client.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}