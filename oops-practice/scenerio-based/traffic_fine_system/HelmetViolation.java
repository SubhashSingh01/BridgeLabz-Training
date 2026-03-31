package traffic_fine_system;

import java.time.LocalDate;

public class HelmetViolation extends Violation {
	HelmetViolation(LocalDate date){
		super("without-helmet",date);
	}
	@Override
	public int calculateFine(int repeated) {
		if(repeated>2)
			return 1000+(100*(repeated-2));
		return 1000;
	}
}
