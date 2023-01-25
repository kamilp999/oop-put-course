package pl.poznan.put;

public class NavMenu {

    private static final String QUESTION_WHICH_ROW = "Enter a row number:";
    private static final String QUESTION_WHICH_SEAT = "Enter a seat number in that row:";
    private static final String[] MENU_ITEMS = {
        "1. Show the seats",
        "2. Buy a ticket",
        "0. Exit"
    };

    private final Renderer renderer;
    private final SeatCollection seatCollection;

    NavMenu(SeatCollection seatCollection) {
        this.seatCollection = seatCollection;
        this.renderer = new Renderer();
    }

    public void displayNavMenu() {
        StringBuilder output = new StringBuilder("\n");
        for (String menuItem : MENU_ITEMS) {
            output.append(menuItem);
            output.append('\n');
        }
        if (!this.invokeAction(this.renderer.askForInt(String.valueOf(output)))) {
            return;
        }
        this.displayNavMenu();
    }

    private boolean invokeAction(int actionId) {
        switch (actionId) {
            case 0 -> {
                return false;
            }

            case 1 -> { try {
                this.seatCollection.renderSeats();
            } catch (Exception a){
                System.out.println("Error 1");
            }
            }
            case 2 -> {
                try {
                    this.seatCollection.buyTicket(
                            this.renderer.askForInt(QUESTION_WHICH_ROW),
                            this.renderer.askForInt(QUESTION_WHICH_SEAT)
                    );
                }catch (Exception ab){
                System.out.println("Incorrect number of seat");
                }
            }
        }
        return true;
    }
}
