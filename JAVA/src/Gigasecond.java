import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private final long GIGASECOND = 1_000_000_000L;
    private LocalDateTime fechaHora;

    public Gigasecond(LocalDate moment) {
        this.fechaHora = moment.atStartOfDay().plusSeconds(GIGASECOND);
    }

    public Gigasecond(LocalDateTime moment) {
        this.fechaHora = moment.plusSeconds(GIGASECOND);
    }

    public LocalDateTime getDateTime() {
        return fechaHora;
    }

    public static void main(String[] args) {
        LocalDate fecha = LocalDate.of(2021, 9, 15);
        Gigasecond gigasecond = new Gigasecond(fecha);
        System.out.println(gigasecond.getDateTime());
    }
}