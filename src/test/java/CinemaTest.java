import org.example.Cinema;

public class CinemaTest {
    public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        Cinema cinema = new Cinema(5, 10, 20);

        // Test booking seats
        System.out.println("Test 1: Booking seats");
        cinema.bookSeats(0, 4, new int[]{2, 3, 4, 5});
        cinema.printSeatingArrangement(0);

        // Test cancelling booking
        System.out.println("\nTest 2: Cancelling booking");
        cinema.cancelBooking(0, 4, new int[]{5});
        cinema.printSeatingArrangement(0);

        // Test checking availability
        System.out.println("\nTest 3: Checking availability");
        boolean availabilityCheck = cinema.checkAvailability(0, 3);
        System.out.println("Are 3 consecutive seats available? " + availabilityCheck);



    }
}
