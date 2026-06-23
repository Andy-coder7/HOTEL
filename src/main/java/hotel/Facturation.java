package hotel;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;


@AllArgsConstructor
@Getter
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

    /////////////////////
    ///
    ///
    // ATO MISY OVAINA EEEEEEEEE /////
    //
    //
    // /

    public void payer(ModePaiement modePaiement) {
        //ito méthode ito tokony ampiana oe ra cash de ok fa ra carte de mila référence transaction
        this.modePaiement = modePaiement;
        this.paye = true;
    }
}
