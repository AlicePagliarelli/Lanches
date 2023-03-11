package padroescriacao.singleton;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LanchesTest {

    @Test
    public void deveRetornarNomeLanche() {
        Lanches.getInstance().setNomeLanches("Lanche 1");
        assertEquals("Lanche 1", Lanches.getInstance().getNomeLanches());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Lanches.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Lanches.getInstance().getUsuarioLogado());
    }

}