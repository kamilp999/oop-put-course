package pl.poznan.put;
import java.util.ArrayList;
import java.util.Map;

public class SeatCollection
{
    private final int numRows;
    private final int seatsPerRow;

    private final ArrayList<Seat> seats;
    private final Renderer renderer;
    private final TicketFactory ticketFactory;

    SeatCollection(int numRows, int seatsPerRow)
    {
        this.numRows = numRows;
        this.seatsPerRow = seatsPerRow;
        this.seats = new ArrayList<>();
        this.renderer = new Renderer();
        this.ticketFactory = new TicketFactory();
        this.generateSeats();
    }

    public void renderSeats()
    {
        this.renderer.displayVoid(this.getSeatsView());
    }

    public Ticket buyTicket(int rowId, int seatId)
    {
        int selectedSeatId = 0;
        if (rowId == 1) {
            selectedSeatId = seatId-1;
        } else {
            selectedSeatId = ((rowId - 1) * this.seatsPerRow) + (seatId - 1);
        }
        if (this.seats.get(selectedSeatId).getSeatBooked())
            throw new IllegalArgumentException();

        if ((selectedSeatId-((rowId-1)*seatsPerRow))>=this.seatsPerRow)  {
            throw new IllegalArgumentException();
        }
        Ticket ticket = this.ticketFactory.create(this.seats.get(selectedSeatId));
        ticket.buy();
        Map<String, String> ticketInfo = ticket.getTicketInfo();

        this.renderer.displayVoid(String.format("Ticket price: %s", ticketInfo.get(Ticket.TICKET_PRICE)));

        return ticket;
    }

    private void generateSeats()
    {
        for (int currentRow = 1; currentRow <= this.numRows; currentRow++) {
            for (int currentSeat = 1; currentSeat <= this.seatsPerRow; currentSeat++) {
                this.seats.add(
                        new Seat(currentRow-1, this.numRows)
                );
            }
        }
    }

    private String getSeatsView()
    {
        StringBuilder output = new StringBuilder("\nCinema: (R-reserved F-Free)\n");

        for (int currentRowId = 1; currentRowId <= this.numRows; currentRowId++) {
            if (currentRowId == 1) {
                output.append(this.generateSeatViewHeader());
            }
            output.append(currentRowId);
            for (Seat singleSeat : this.getSeatsByRow(currentRowId-1)) {
                output.append(" ");

                output.append(singleSeat.getSeatBooked() ? "R" : "F");

            }
            output.append('\n');
        }
        return String.valueOf(output);
    }

    private String generateSeatViewHeader()
    {
        StringBuilder output = new StringBuilder();

        output.append(' ');
        for (int i = 1;i <= this.seatsPerRow; i++) {
            output.append(' ');
            output.append(i);
        }
        output.append('\n');

        return String.valueOf(output);
    }

    private ArrayList<Seat> getSeatsByRow(int currentRow)
    {
        ArrayList<Seat> output = new ArrayList<>();
        int firstSeatInRowId =  currentRow == 0 ? 0 : (currentRow * seatsPerRow);
        int lastSeatInRowId = firstSeatInRowId + seatsPerRow;

        for (int currentSeat = firstSeatInRowId;currentSeat < lastSeatInRowId;currentSeat++) {
            output.add(this.seats.get(currentSeat));
        }
        return output;
    }
}
