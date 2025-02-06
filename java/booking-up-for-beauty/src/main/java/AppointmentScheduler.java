import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy H:mm:ss");
      return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
      return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
      String date = appointmentDate.format(DateTimeFormatter.ofPattern("EEEE, MMMM d, u,"));
      String time = appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a"));

        return String.format("You have an appointment on %s at %s.", date, time);
    }

    public LocalDate getAnniversaryDate() {
      int year = LocalDateTime.now().getYear();
      return LocalDate.of(year, 9, 15);
    }
}
