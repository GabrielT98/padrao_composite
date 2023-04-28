import org.example.CarroLuxo;
import org.example.CarroSimples;
import org.example.Frota;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class AluguelTeste {

    @Test
    void deveRetonarDescricaoVeiculosFrota(){
        CarroSimples carro1 = new CarroSimples("Fiat", "Uno", 100.0);
        CarroLuxo carro2 = new CarroLuxo("BMW", "Série 7", 500.0, 200.0);

        Frota frota1 = new Frota("Frota 1", "Fiat Uno e BMW Série 7", 0.0);
        frota1.addCarro(carro1);
        frota1.addCarro(carro2);
        assertEquals("Frota 1 Fiat Uno e BMW Série 7 (frota):\n" +
                "  - Fiat Uno\n" +
                "  - BMW Série 7\n",frota1.getDescricao());


    }
}
