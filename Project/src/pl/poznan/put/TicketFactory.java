package pl.poznan.put;

public class TicketFactory {
    public Ticket create(Seat selectedSeat) {
        return new Ticket(selectedSeat);
    }
}
