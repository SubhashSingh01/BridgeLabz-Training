

public interface HospitalService {
    void bookAppointment(Patient p, Doctor d, String date) throws AppointmentNotAvailableException;
    void printAppointmentDetails();
}
