import java.util.*;

class Reservation {
    String guestName;
    String roomType;

    Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }
}

class BookingHistory {

    private List<Reservation> reservations = new ArrayList<>();

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}

class BookingReportService {

    public void generateReport(List<Reservation> reservations) {

        System.out.println("Booking History and Reporting\n");
        System.out.println("Booking History Report");

        for (Reservation r : reservations) {
            System.out.println("Guest: " + r.guestName + ", Room Type: " + r.roomType);
        }
    }
}

public class BookApp {

    public static void main(String[] args) {

        BookingHistory history = new BookingHistory();

        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanmathi", "Suite"));

        // Generate report
        BookingReportService reportService = new BookingReportService();
        reportService.generateReport(history.getReservations());
    }
}