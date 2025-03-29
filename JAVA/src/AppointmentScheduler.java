import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    LocalDateTime fechaActual = LocalDateTime.now();
    private static final DateTimeFormatter APPOINTMENT_FORMATTER = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");
    private static final DateTimeFormatter DESCRIPTION_FORMATTER = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, APPOINTMENT_FORMATTER);
        
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(fechaActual);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int horaCita = appointmentDate.getHour();
        if (horaCita >= 12 && horaCita < 18){
            return true;
        }else{
            return false;
        }
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return "You have an appointment on " + DESCRIPTION_FORMATTER.format(appointmentDate) + ".";
    }

    public LocalDate getAnniversaryDate() {
        LocalDate aniversario = LocalDate.of(2025, 9, 15);
        return aniversario;
    }
}