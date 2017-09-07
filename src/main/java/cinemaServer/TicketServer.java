package cinemaServer;

import java.net.*;
import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

class SeatAvailable {

    public ArrayList<Booking> bookingList = new ArrayList<>();
    BookingFrame b;
    
    public SeatAvailable() {
        Booking b1 = new Booking("Friz", "Arrival", "12:00", 5);
        Booking b2 = new Booking("Jay", "Arrival", "12:00", 4);
        Booking b3 = new Booking("Mohi", "Arrival", "12:00", 10);
        Booking b4 = new Booking("Jessica", "Inside Men", "12:00", 11);
        Booking b5 = new Booking("Monica", "Inside Men", "12:00", 12);

        bookingList.add(b1);
        bookingList.add(b2);
        bookingList.add(b3);
        bookingList.add(b4);
        bookingList.add(b5);
        
        
        
        DefaultTableModel bookingModel = 
          new DefaultTableModel( new Object[]{ "Name", "Movie", "Time", "Seat" }, 0 );

        
        
        b = new BookingFrame();
        b.setTitle("Admin booking list");
        b.populateTable(bookingList);
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.pack();
        b.setVisible(true);
    }

    public BookingFrame getB() {
        return b;
    }
    
    
    
}

class Booking {

    public String Name;
    public String moiveName;
    public String time;
    public int seat;

    public Booking() {

    }

    public Booking(String name, String moiveName, String time, int seat) {
        this.Name = name;
        this.moiveName = moiveName;
        this.time = time;
        this.seat = seat;
    }

    public String getName() {
        return Name;
    }

    public String getMoiveName() {
        return moiveName;
    }

    public String getTime() {
        return time;
    }

    public int getSeat() {
        return seat;
    }
    
    
}

public class TicketServer {

    public static void main(String[] args) {
        int portNumber = 12001;

        try (ServerSocket server = new ServerSocket(portNumber)) {
            System.out.println("Waiting for connection establishment.");

            SeatAvailable SA = new SeatAvailable();
            HashMap<String, ObjectOutputStream> hm = new HashMap<>();
            while (true) {
                Socket sock = server.accept();
                ChatThread chatthread = new ChatThread(sock, SA, hm);//seatAvailable
                chatthread.start();
            }
        } catch (IOException e) {
            System.out.println("Could not listen on port " + portNumber);
            System.exit(-1);
        }
    }
}

class ChatThread extends Thread {

    static DataInputStream inputStream;
    static DataOutputStream outputStream;
    private Socket sock;
    private String id;
    private SeatAvailable SA;
    private HashMap<String, ObjectOutputStream> hm;
    private Booking book;

    TicketServer ts = new TicketServer();

    public ChatThread(Socket sock, SeatAvailable SA, HashMap<String, ObjectOutputStream> hm) {
        this.sock = sock;
        this.SA = SA;
        this.hm = hm;
        book = new Booking();
        
        try {
            inputStream = new DataInputStream(sock.getInputStream());
            id = inputStream.toString();
            outputStream = new DataOutputStream(sock.getOutputStream());
            ObjectOutputStream oos = new ObjectOutputStream(sock.getOutputStream());

            System.out.println("Connected user id is " + id + ".");
            synchronized (hm) {
                hm.put(this.id, oos);
            }
            System.out.println("connection");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        int counter = 1;
        try {
            String name, movieName, time, seatNumber;
            String msgIn = "";
            System.out.println("process start");

            while ((msgIn = inputStream.readUTF()) != null) {
                if (counter == 1) {
                    book.Name = msgIn;
                } else if (counter == 2) {
                    book.moiveName = msgIn;
                } else if (counter == 3) {
                    book.time = msgIn;
                    
                    PrintWriter out = new PrintWriter(sock.getOutputStream(),true);
                    for (Booking b : SA.bookingList) {
                        if ((b.moiveName.equals(book.moiveName)) && (b.time.equals(book.time))) {
                            out.println(Integer.toString(b.seat));
                            System.out.println(Integer.toString(b.seat));
                        }
                    }
                    out.println("quit");

                } else if (counter == 4) {
                    book.seat = Integer.parseInt(msgIn);
                }
                
                counter++;
                
                if (counter == 5) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {

            synchronized (SA) {
                if (counter >= 5) {
                    SA.bookingList.add(book);
                    System.out.println("Booking has been made!");
                    SA.getB().populateTable(SA.bookingList);
                } else {
                    book = null;
                    System.out.println("Booking Failed!");
                }
            }

            System.out.println(id + " is disconnected.");
            try {
                if (sock != null) {
                    sock.close();
                }
            } catch (Exception e) {
            }
        }
    }
}