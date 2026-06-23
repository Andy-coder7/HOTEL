package hotel;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Reservation {
    private Client client;
    private Chambre chambre;
    private LocalDateTime debutResa;
    private LocalDateTime finResa;


    public double calculePrixAPayer(){
        long nombreNuits = ChronoUnit.DAYS.between(debutResa.toLocalDate(), finResa.toLocalDate());

        if (nombreNuits <= 0) {
            nombreNuits = 1;
        }

        return nombreNuits * chambre.getPrix();
    }

    public boolean chevauche(LocalDateTime debut, LocalDateTime fin) {
        return debutResa.isBefore(fin) && debut.isBefore(finResa);
    }
}