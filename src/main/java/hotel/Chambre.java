package hotel;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Chambre {
    private int id;
    private boolean statut;   //liste de reservation ny tokony eto mba ahitana oe libre ve sa tsia izy
    private double prix;
    private TypeChambre typeChambre;
    private int quantitePersonne;


}