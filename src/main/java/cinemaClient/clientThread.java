package cinemaClient;

import java.io.DataInputStream;
import java.net.Socket;

class clientThread extends Thread {

    private Socket sock;
    private ClientFrame frame;
    
    private DataInputStream inputStream;
    private boolean done = false;
    
    private int[][] seatsAvailable = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };
    
    public clientThread(Socket sock, ClientFrame frame) {
        this.sock = sock;
        this.frame = frame;

        try {
            inputStream = new DataInputStream(sock.getInputStream());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        
        try {
            System.out.println("Thread running");

            String msgIn = "";
            int counter = 0, seat;
            
            while((msgIn = inputStream.readLine()) != null) {
                
                if (msgIn.equals("quit")) {
                    break;
                }
                seat = Integer.parseInt(msgIn.replaceAll("[^\\d.]", ""));
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (counter == (seat-1)) {
                            seatsAvailable[i][j] = 1;
                        }
                        counter++;
                    }
                }
                counter = 0;
                System.out.println(seat);
            } 
            done = true;
            
            frame.changePanel("seat", frame.getPanelName());
            System.out.println("Thread stopped, client got seats.");
            
        } catch (Exception e) {
            System.out.println(e);
        }
            
    }

    public int[][] getSeatsAvailable() {
        return seatsAvailable;
    }

    public boolean isDone() {
        return done;
    }
}