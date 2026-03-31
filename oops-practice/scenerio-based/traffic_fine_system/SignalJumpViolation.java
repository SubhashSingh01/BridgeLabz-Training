package traffic_fine_system;

import java.time.LocalDate;

public class SignalJumpViolation extends Violation {
	SignalJumpViolation(LocalDate date){
		super("without-helmet",date);
	}
	@Override
	public int calculateFine(int repeated) {
		if(repeated>2)
			return 1200+(100*(repeated-2));
		return 1200;
	}
}
