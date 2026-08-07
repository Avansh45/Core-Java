package Project.BusBookingSystem;

import Project.BusBookingSystem.dao.BookingDAO;
import Project.BusBookingSystem.dao.BusDAO;
import Project.BusBookingSystem.dao.PassengerDAO;

import Project.BusBookingSystem.model.Bus;
import java.sql.Time;

import Project.BusBookingSystem.model.Booking;
import Project.BusBookingSystem.model.BookingStatus;

import java.util.List;

import Project.BusBookingSystem.model.Passenger;
import Project.BusBookingSystem.model.Gender;

import java.util.Scanner;

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";

    private static final Scanner sc = new Scanner(System.in);

    private static final BusDAO busDAO = new BusDAO();
    private static final PassengerDAO passengerDAO = new PassengerDAO();
    private static final BookingDAO bookingDAO = new BookingDAO();

    public static void main(String[] args) {

        while (true) {

            printMenu();

            System.out.print(YELLOW + "Enter your choice : " + RESET);

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(RED + "Invalid Input!" + RESET);
                pressEnterToContinue();
                continue;
            }

            switch (choice) {

                case 1:
                    addBus();
                    break;

                case 2:
                    viewAllBuses();
                    break;

                case 3:
                    searchBus();
                    break;

                case 4:
                    registerPassenger();
                    break;

                case 5:
                    viewAllPassengers();
                    break;

                case 6:
                    bookTicket();
                    break;

                case 7:
                    viewAllBookings();
                    break;

                case 8:
                    cancelBooking();
                    break;

                case 9:
                    System.out.println(GREEN + "Thank You for Using Bus Booking System." + RESET);
                    System.exit(0);

                default:
                    System.out.println(RED + "Invalid Choice!" + RESET);
            }

            pressEnterToContinue();
        }
    }

    private static void printMenu() {

        System.out.println(CYAN);
        System.out.println("==================================================");
        System.out.println("           BUS BOOKING MANAGEMENT SYSTEM");
        System.out.println("==================================================");
        System.out.println("1. Add Bus");
        System.out.println("2. View All Buses");
        System.out.println("3. Search Bus");
        System.out.println("4. Register Passenger");
        System.out.println("5. View All Passengers");
        System.out.println("6. Book Ticket");
        System.out.println("7. View All Bookings");
        System.out.println("8. Cancel Booking");
        System.out.println("9. Exit");
        System.out.println("==================================================");
        System.out.print(RESET);
    }

    private static void pressEnterToContinue() {
        System.out.println();
        System.out.print(YELLOW + "Press Enter to Continue..." + RESET);
        sc.nextLine();
    }



    private static void addBus() {

        System.out.println("\n========== ADD NEW BUS ==========\n");

        try {

            Bus bus = new Bus();

            System.out.print("Bus Name : ");
            bus.setBusName(sc.nextLine());

            System.out.print("Source : ");
            bus.setSource(sc.nextLine());

            System.out.print("Destination : ");
            bus.setDestination(sc.nextLine());

            System.out.print("Departure Time (HH:mm:ss) : ");
            bus.setDepartureTime(Time.valueOf(sc.nextLine()));

            System.out.print("Arrival Time (HH:mm:ss) : ");
            bus.setArrivalTime(Time.valueOf(sc.nextLine()));

            System.out.print("Total Seats : ");
            int totalSeats = Integer.parseInt(sc.nextLine());

            bus.setTotalSeats(totalSeats);
            bus.setAvailableSeats(totalSeats);

            System.out.print("Ticket Price : ");
            bus.setTicketPrice(Double.parseDouble(sc.nextLine()));

            System.out.print("Bus Type : ");
            bus.setBusType(sc.nextLine());

            if(busDAO.addBus(bus))
                System.out.println(GREEN + "\nBus Added Successfully!\n" + RESET);
            else
                System.out.println(RED + "\nFailed to Add Bus!\n" + RESET);

        }
        catch(Exception e){
            System.out.println(RED + "Invalid Input!" + RESET);
        }
    }

    private static void viewAllBuses() {

        List<Bus> buses = busDAO.getAllBuses();

        if(buses.isEmpty()){
            System.out.println(RED + "\nNo Bus Found.\n" + RESET);
            return;
        }

        System.out.println("\n===================== AVAILABLE BUSES =====================");

        System.out.printf("%-5s %-20s %-12s %-12s %-10s %-10s %-8s %-8s %-10s %-15s%n",
                "ID",
                "Bus Name",
                "Source",
                "Destination",
                "Depart",
                "Arrival",
                "Seats",
                "Avail",
                "Price",
                "Type");

        System.out.println("-----------------------------------------------------------------------------------------------");

        for(Bus bus : buses){

            System.out.printf("%-5d %-20s %-12s %-12s %-10s %-10s %-8d %-8d %-10.2f %-15s%n",

                    bus.getBusId(),
                    bus.getBusName(),
                    bus.getSource(),
                    bus.getDestination(),
                    bus.getDepartureTime(),
                    bus.getArrivalTime(),
                    bus.getTotalSeats(),
                    bus.getAvailableSeats(),
                    bus.getTicketPrice(),
                    bus.getBusType()
            );
        }

    }

    private static void searchBus() {

        System.out.println("\n========== SEARCH BUS ==========\n");

        System.out.print("Enter Source : ");
        String source = sc.nextLine();

        System.out.print("Enter Destination : ");
        String destination = sc.nextLine();

        List<Bus> buses = busDAO.searchBus(source, destination);

        if(buses.isEmpty()){

            System.out.println(RED + "\nNo Bus Found.\n" + RESET);
            return;
        }

        System.out.println("\n================ SEARCH RESULT ================");

        System.out.printf("%-5s %-20s %-12s %-12s %-10s %-10s %-8s %-8s %-10s %-15s%n",
                "ID",
                "Bus Name",
                "Source",
                "Destination",
                "Depart",
                "Arrival",
                "Seats",
                "Avail",
                "Price",
                "Type");

        System.out.println("-----------------------------------------------------------------------------------------------");

        for(Bus bus : buses){

            System.out.printf("%-5d %-20s %-12s %-12s %-10s %-10s %-8d %-8d %-10.2f %-15s%n",

                    bus.getBusId(),
                    bus.getBusName(),
                    bus.getSource(),
                    bus.getDestination(),
                    bus.getDepartureTime(),
                    bus.getArrivalTime(),
                    bus.getTotalSeats(),
                    bus.getAvailableSeats(),
                    bus.getTicketPrice(),
                    bus.getBusType()
            );
        }

    }

    private static void registerPassenger() {

        System.out.println("\n========== REGISTER PASSENGER ==========\n");

        try {

            Passenger passenger = new Passenger();

            System.out.print("Passenger Name : ");
            passenger.setPassengerName(sc.nextLine());

            System.out.print("Age : ");
            passenger.setAge(Integer.parseInt(sc.nextLine()));

            System.out.println("Gender");
            System.out.println("1. MALE");
            System.out.println("2. FEMALE");
            System.out.println("3. OTHER");

            System.out.print("Choose : ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    passenger.setGender(Gender.MALE);
                    break;

                case 2:
                    passenger.setGender(Gender.FEMALE);
                    break;

                case 3:
                    passenger.setGender(Gender.OTHER);
                    break;

                default:
                    System.out.println(RED + "Invalid Gender!" + RESET);
                    return;
            }

            System.out.print("Phone Number : ");
            passenger.setPhone(sc.nextLine());

            if (passengerDAO.addPassenger(passenger))
                System.out.println(GREEN + "\nPassenger Registered Successfully!\n" + RESET);
            else
                System.out.println(RED + "\nUnable to Register Passenger!\n" + RESET);

        } catch (Exception e) {

            System.out.println(RED + "Invalid Input!" + RESET);
        }

    }

    private static void viewAllPassengers() {

        List<Passenger> passengers = passengerDAO.getAllPassengers();

        if (passengers.isEmpty()) {

            System.out.println(RED + "\nNo Passenger Found.\n" + RESET);
            return;
        }

        System.out.println("\n===================== PASSENGERS =====================");

        System.out.printf("%-5s %-25s %-8s %-12s %-15s%n",
                "ID",
                "Name",
                "Age",
                "Gender",
                "Phone");

        System.out.println("--------------------------------------------------------------");

        for (Passenger passenger : passengers) {

            System.out.printf("%-5d %-25s %-8d %-12s %-15s%n",

                    passenger.getPassengerId(),
                    passenger.getPassengerName(),
                    passenger.getAge(),
                    passenger.getGender(),
                    passenger.getPhone());
        }

    }

    private static void bookTicket() {

        try {

            System.out.println("\n========== BOOK TICKET ==========\n");

            Booking booking = new Booking();

            System.out.print("Bus ID : ");
            booking.setBusId(Integer.parseInt(sc.nextLine()));

            System.out.print("Passenger ID : ");
            booking.setPassengerId(Integer.parseInt(sc.nextLine()));

            System.out.print("Seat Number : ");
            booking.setSeatNumber(Integer.parseInt(sc.nextLine()));

            booking.setBookingStatus(BookingStatus.CONFIRMED);

            if (bookingDAO.bookTicket(booking)) {
                System.out.println(GREEN + "\nTicket Booked Successfully!\n" + RESET);
            } else {
                System.out.println(RED + "\nBooking Failed!\n" + RESET);
            }

        } catch (Exception e) {
            System.out.println(RED + "Invalid Input!" + RESET);
        }
    }

    private static void viewAllBookings() {

        List<Booking> bookingList = bookingDAO.getAllBookings();

        if (bookingList.isEmpty()) {
            System.out.println(RED + "\nNo Bookings Found!\n" + RESET);
            return;
        }

        System.out.println("\n====================== BOOKINGS ======================");

        System.out.printf("%-10s %-8s %-12s %-8s %-15s %-25s%n",
                "Booking ID",
                "Bus ID",
                "Passenger ID",
                "Seat",
                "Status",
                "Booking Date & Time");

        System.out.println("-------------------------------------------------------------------------------");

        for (Booking booking : bookingList) {

            System.out.printf("%-10d %-8d %-12d %-8d %-15s %-25s%n",
                    booking.getBookingId(),
                    booking.getBusId(),
                    booking.getPassengerId(),
                    booking.getSeatNumber(),
                    booking.getBookingStatus(),
                    booking.getBookingDateTime());
        }
    }

    private static void cancelBooking() {

        System.out.println("\n========== CANCEL BOOKING ==========\n");

        try {

            System.out.print("Enter Booking ID : ");
            int bookingId = Integer.parseInt(sc.nextLine());

            if (bookingDAO.cancelBooking(bookingId)) {

                System.out.println(GREEN + "\nBooking Cancelled Successfully!\n" + RESET);

            } else {

                System.out.println(RED + "\nBooking Not Found or Cancellation Failed!\n" + RESET);

            }

        } catch (Exception e) {

            System.out.println(RED + "\nInvalid Input!\n" + RESET);

        }
    }

}