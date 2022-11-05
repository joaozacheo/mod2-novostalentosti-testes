package br.univille;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AvaliacaoTest {
    private Avaliacao avaliacao;

    @DisplayName("Testa nota decimal")
    @Test
    public void testaNotaDecimal(){
        try{
            avaliacao = new Avaliacao("Descricao", 9.5f);
            avaliacao.getNota();
        }catch(Exception e){
            assertTrue(false);
        }
    }

    @DisplayName("Teste nota negativa")
    @Test
    public void testaNotaNegativa(){
        try{
            avaliacao = new Avaliacao("Descricao", -5);
            avaliacao.getNota();
            fail("Devia ocorrer Exception");
        }catch(Exception e){
            assertTrue(true);
        }
    }
}
