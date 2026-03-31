package Classroom;

public class Main {

	public static void main(String[] args) {
		 AttendanceManager manager = new AttendanceManager();

	     Session s1 = new Session("SESSION1");
	     Session s2 = new Session("SESSION2");

	     Student st1 = new Student("Shaurya01");
	     Student st2 = new Student("Vikash02");
	     Student st3 = new Student("Dheeraj03");
	     Student st4 = new Student("Rajat04");
	     Student st5 = new Student("GC05");
	     Student st6 = new Student("Anuj06");
	     
	     try {
	    	 manager.markAttendance(s1, st1);
	    	 manager.markAttendance(s1, st2);
	    	 manager.markAttendance(s1, st3);
	    	 manager.markAttendance(s1, st4);
	    	 manager.markAttendance(s1, st5);
	    	 manager.markAttendance(s2, st1);
	    	 manager.markAttendance(s2, st3);
	    	 manager.markAttendance(s2, st4);
	    	 manager.markAttendance(s2, st6);
	    	 manager.markAttendance(s1, st2);
	    	 
	     }
	     catch(ThrowDuplicateAttendanceException e) {
	    	 System.out.println(e.getMessage());
	     }
	     manager.removeAttendance(s1, st4);
	     manager.displayAttendance();

	}

}
