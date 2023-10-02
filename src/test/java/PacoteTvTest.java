import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacoteTvTest {
    @Test
    void deveRetornarDescricaoDoPacoteTv() {
        PacoteTv pacote = new PacoteBasico();

        assertEquals("Pacote Basico", pacote.getDescricao());
    }

    @Test
    void deveRetornarCustoDoPacoteTv() {
        PacoteTv pacote = new PacoteBasico();

        assertEquals(50.0, pacote.getCusto());
    }

    @Test
    void deveRetornarDescricaoDoPacoteTvComCanaisAdicionaisEsportivos() {
        PacoteTv pacote = new CanaisEsportivos(new PacoteBasico());

        assertEquals("Pacote BasicoCanais de Esportes", pacote.getDescricao());
    }

    @Test
    void deveRetornarCustoDoPacoteTvComCanaisAdicionaisEsportivos() {
        PacoteTv pacote = new CanaisEsportivos(new PacoteBasico());

        assertEquals(60.0, pacote.getCusto());
    }

    @Test
    void deveRetornarDescricaoDoPacoteTvComCanaisAdicionaisFilmes() {
        PacoteTv pacote = new CanaisFilmes(new PacoteBasico());

        assertEquals("Pacote Basico Canais de Filmes", pacote.getDescricao());
    }

    @Test
    void deveRetornarCustoDoPacoteTvComCanaisAdicionaisFilmes() {
        PacoteTv pacote = new CanaisFilmes(new PacoteBasico());

        assertEquals(65.0, pacote.getCusto());
    }


    @Test
    void deveRetornarDescricaoDoPacoteTvComGravacaoCanaisHD() {
        PacoteTv pacote = new CanaisHD(new PacoteBasico());

        assertEquals("Pacote BasicoCanais em HD", pacote.getDescricao());
    }

    @Test
    void deveRetornarCustoDoPacoteTvComGravacaoCanaisHD() {
        PacoteTv pacote = new CanaisHD(new PacoteBasico());

        assertEquals(75.0, pacote.getCusto());
    }


}
