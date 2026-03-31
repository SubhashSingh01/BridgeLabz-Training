package Restaurant_Table_Reservation;
import java.util.*;

public class Restaurant {
	Map<Integer,Table> tables=new HashMap<>();
	List<Reservation> reservations=new ArrayList<>();
	
	public void addTable(int tableNumber) {
		tables.put(tableNumber, new Table(tableNumber));
	}
	public void reserveTable(int tableNumber,String timeSlot) throws TableAlreadyReservedException {
		for (Reservation r : reservations) {
            if (r.getTableNumber() == tableNumber &&
                r.getTimeSlot().equals(timeSlot)) {

                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " is already reserved for " + timeSlot);
            }
        }

        reservations.add(new Reservation(tableNumber, timeSlot));
        System.out.println("Table " + tableNumber + " reserved for " + timeSlot);
    }
	public void cancelReservation(int tableNumber, String timeSlot) {
        Iterator<Reservation> itr = reservations.iterator();

        while (itr.hasNext()) {
            Reservation r = itr.next();
            if (r.getTableNumber() == tableNumber &&
                r.getTimeSlot().equals(timeSlot)) {

                itr.remove();
                System.out.println("Reservation cancelled for table "
                        + tableNumber + " at " + timeSlot);
                return;
            }
        }

        System.out.println("No reservation found to cancel");
    }
	public void showAvailableTables(String timeSlot) {
        System.out.println("Available tables for " + timeSlot + ":");

        for (int tableNumber : tables.keySet()) {
            boolean isReserved = false;

            for (Reservation r : reservations) {
                if (r.getTableNumber() == tableNumber &&
                    r.getTimeSlot().equals(timeSlot)) {
                    isReserved = true;
                    break;
                }
            }

            if (!isReserved) {
                System.out.println("Table " + tableNumber);
            }
        }
    }
	
}
