package br.univille;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RendimentoTest {
    
    @DisplayName("Teste valor válido")
    @Test
    public void testaValorValido(){
        try{
            Rendimento rendimento = new Rendimento("Descricao", 2000);
            rendimento.getValor();
        }catch(Exception e){
            assertTrue(false);
        }
    }

    @DisplayName("Teste valor inválido")
    @Test
    public void testaValorInvalido(){
        try{
            Rendimento rendimento = new Rendimento("Descricao", -2000);
            rendimento.getValor();
            fail("Deveria ocorrer Exception");
        }catch(Exception e){
            assertTrue(true);
        }
    }
}
