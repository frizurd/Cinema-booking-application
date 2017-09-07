package cinemaClient;

public class Booking {
    
    private int bookingID;
    private int seatNumber;
    private String ownerName;
    private String movieName;
    private String movieTime;
    
    
    public Booking(String movieName, String movieTime) {
        movieName = movieName;
        movieTime = movieTime;
    }
    
}
