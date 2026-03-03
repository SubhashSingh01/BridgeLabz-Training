package traffic_fine_system;

import java.time.LocalDate;

abstract class Violation {
	private String vType;
	private LocalDate vDate;
	Violation(String vType, LocalDate vDate){
		this.vType=vType;
		this.vDate=vDate;
	}
	public String getType() {
		return vType;
	}
	public LocalDate getDate() {
		return vDate;
	}
	abstract int calculateFine(int repeated); 
}
