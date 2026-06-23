package hotel;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class TypeChambre {
        private String nom;
        private int nombreLit;
        private int nombreDouche;

}
