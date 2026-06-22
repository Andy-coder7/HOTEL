package hotel;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private Client client;
    private Chambre chambre;
    private LocalDateTime debutResa;
    private LocalDateTime finResa;

    public Reservation(Client client, Chambre chambre, LocalDateTime debutResa, LocalDateTime finResa) {
        this.client = client;
        this.chambre = chambre;
        this.debutResa = debutResa;
        this.finResa = finResa;
    }

    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }

    public Chambre getChambre() { return chambre; }
    public void setChambre(Chambre chambre) { this.chambre = chambre; }

    public LocalDateTime getDebutResa() { return debutResa; }
    public void setDebutResa(LocalDateTime debutResa) { this.debutResa = debutResa; }

    public LocalDateTime getFinResa() { return finResa; }
    public void setFinResa(LocalDateTime finResa) { this.finResa = finResa; }

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