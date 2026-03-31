package Restaurant_Table_Reservation;

public class Reservation {
	int tableNumber;
    String timeSlot;

    Reservation(int tableNumber, String timeSlot) {
        this.tableNumber = tableNumber;
        this.timeSlot = timeSlot;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public String getTimeSlot() {
        return timeSlot;
    }
    
}
