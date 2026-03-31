package Classroom;
import java.util.*;
public class AttendanceManager {
Scanner sc=new Scanner(System.in);
Map<String,Set<String>> attendance;
Set<Student> students=new HashSet<>();
AttendanceManager(){
	attendance=new HashMap<>();
}

public void markAttendance(Session session, Student student) throws ThrowDuplicateAttendanceException {
	attendance.putIfAbsent(session.sessionId, new HashSet<>());
	Set<String> presents=attendance.get(session.sessionId);
	if(presents.contains(student.studentId)) {
		throw new ThrowDuplicateAttendanceException(student.studentId+" is already marked present ");
	}
	else
		presents.add(student.studentId);
}
public void removeAttendance(Session session, Student student) {

    String sessionId = session.sessionId;
    String studentId = student.studentId;

    Set<String> students = attendance.get(sessionId); //if that session id does not exist in this map then it will give Null;
    if (students != null) {
        students.remove(studentId);
    }
}
public void displayAttendance() {

	System.out.println("Here is the session wise attendance record: ");
    if (attendance.isEmpty()) {
        System.out.println(" No attendance records found ");
        return;
    }

    for (Map.Entry<String, Set<String>> entry : attendance.entrySet()) {
        System.out.println("Session ID: " + entry.getKey());
        System.out.println("Students: " + entry.getValue());
        System.out.println("-------------------------");
    }
}

}
