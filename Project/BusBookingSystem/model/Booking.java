package Project.BusBookingSystem.model;

import java.time.LocalDateTime;

public class Booking {

    private int bookingId;
    private int busId;
    private int passengerId;
    private int seatNumber;
    private BookingStatus bookingStatus;
    private LocalDateTime bookingDateTime;

    public Booking() {
    }

    public Booking(int bookingId, int busId, int passengerId, int seatNumber, BookingStatus bookingStatus, LocalDateTime bookingDateTime) {
        this.bookingId = bookingId;
        this.busId = busId;
        this.passengerId = passengerId;
        this.seatNumber = seatNumber;
        this.bookingStatus = bookingStatus;
        this.bookingDateTime = bookingDateTime;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public LocalDateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(LocalDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", busId=" + busId +
                ", passengerId=" + passengerId +
                ", seatNumber=" + seatNumber +
                ", bookingStatus=" + bookingStatus +
                ", bookingDateTime=" + bookingDateTime +
                '}';
    }
}