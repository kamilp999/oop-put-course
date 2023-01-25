package pl.poznan.put;

public class Seat {

    private static int seatsCreated;
    private final int PRICE_FRONT_ROW = 10;
    private final int PRICE_BACK_ROW = 8;
    private final int seatId;
    private final int row;

    private final int numRows;
    private final int price;

    private boolean seatBooked;
    public Seat(int seatRow, int numRows) {
        Seat.seatsCreated++;
        this.seatId = Seat.seatsCreated;
        this.row = seatRow;
        this.numRows = numRows;

        this.price = this.calculateSeatPrice(this.getRow());
        this.seatBooked = false;
    }

    public int getSeatId() {
        return this.seatId;
    }
    public int getRow() {
        return row;
    }

    public int getPrice() {
        return price;
    }

    public boolean getSeatBooked() {
        return this.seatBooked;
    }

    public void bookSeat() {
        this.seatBooked = true;
    }


    private int calculateSeatPrice(int row) {
        return (row <= Math.floor(((double)this.numRows/2) - 1)) ? this.PRICE_FRONT_ROW : this.PRICE_BACK_ROW;
    }
}
