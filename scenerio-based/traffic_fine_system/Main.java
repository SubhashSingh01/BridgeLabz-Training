package traffic_fine_system;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		TrafficManager tm = new TrafficManager();
		tm.addViolations("UP85BJ1106", new SpeedViolation(LocalDate.of(2026,01,01)));
		tm.addViolations("UP85BJ1105", new HelmetViolation(LocalDate.of(2026,01,05)));
		tm.addViolations("UP85BJ1105", new SpeedViolation(LocalDate.of(2026,01,11)));
		tm.addViolations("UP85BJ1106", new SignalJumpViolation(LocalDate.of(2026,01,21)));
		tm.addViolations("UP85BJ1106", new HelmetViolation(LocalDate.of(2026,01,15)));
		tm.addViolations("UP85BJ1103", new SpeedViolation(LocalDate.of(2026,01,06)));
		try {
			tm.calculateFine("UP85BJ1106");
			tm.calculateFine("UP85BJ1103");
			tm.calculateFine("UP85BX1108");
		}
		catch(InvalidVehicleException e) {
			System.out.println(e.getMessage());
		}
}
}
