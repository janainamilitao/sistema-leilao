import model.Lance;
import model.Leilao;
import model.Usuario;
import org.junit.Assert;
import org.junit.Test;
import service.Avaliador;

public class AvaliadorTest {

    @Test
    public void deveEntenderLancesEmordemCrescente() {
        /** Parte 1: Cen�rio */
        Usuario joao = new Usuario("Jo�o");
        Usuario maria = new Usuario("Maria");
        Usuario jose = new Usuario("Jos�");

        Leilao leilao = new Leilao("Mustang");

        leilao.propoe(new Lance(joao, 300.00));
        leilao.propoe(new Lance(jose, 400.00));
        leilao.propoe(new Lance(maria, 250.00));

        /** Parte 2: A��o */
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        /** Parte 3: Valida��o */
        double maiorEsperado = 400.00;
        double menorEsperado = 250.00;

        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);

    }
}
