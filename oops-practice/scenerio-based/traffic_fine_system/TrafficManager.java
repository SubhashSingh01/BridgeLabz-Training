package traffic_fine_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrafficManager {
	Map<String,List<Violation>> violations=new HashMap<>();
	public void addViolations(String vehicleNumber,Violation violation) {
		violations.computeIfAbsent(vehicleNumber,k->new ArrayList<>()).add(violation);
	}
	public void calculateFine(String vehicleNumber)throws InvalidVehicleException {
		List<Violation> list=violations.get(vehicleNumber);
		if(list==null)
			throw new InvalidVehicleException(" no vehicle found ");
		else {
		int fine=0;
		int i=1;
		for(Violation v:list) {
			fine+=v.calculateFine(i);
			i++;
		}
		System.out.println("total fine of "+vehicleNumber+" is "+fine);
	}
	}
}
