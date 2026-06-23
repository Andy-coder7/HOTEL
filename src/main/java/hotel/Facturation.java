package hotel;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Facturation {
    private Reservation reservation;
    private double montantTotal;
    private ModePaiement modePaiement;
    private boolean paye;

    public Facturation(Client client, Reservation reservation, Chambre chambre) {
        this.reservation = reservation;
        this.montantTotal = reservation.calculePrixAPayer();
        this.paye = false;
    }


    public void payer(ModePaiement modePaiement) {
        this.modePaiement = modePaiement;
        this.paye = true;
    }
}
