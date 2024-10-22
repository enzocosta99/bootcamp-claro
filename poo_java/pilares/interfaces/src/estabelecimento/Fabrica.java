package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();

        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;
        Impressora impressora = em;

        copiadora.copiar();
        digitalizadora.digitalizar();
        impressora.imprimir();

    }

}