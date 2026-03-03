package traffic_fine_system;

import java.time.LocalDate;

public class SpeedViolation extends Violation {
	SpeedViolation(LocalDate date){
		super("over-speed",date);
	}
	@Override
	public int calculateFine(int repeated) {
		if(repeated>2)
			return 1500+(100*(repeated-2));
		return 1500;
	}
}
