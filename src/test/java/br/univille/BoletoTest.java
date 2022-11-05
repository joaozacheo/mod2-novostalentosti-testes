package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BoletoTest {
    private Boleto boleto;

    //Testes que devem dar tudo certo:
    @DisplayName("Teste pagamento adiantado")
    @Test
    public void pagAdiantado(){
        try {
            boleto = new Boleto(100, 10, 0.25f, 0.15f);
            assertEquals(75,boleto.pagar(7));
        } catch (Exception e) {
            assertTrue(false);
        }
        
    }

    @DisplayName("Teste pagamento no dia")
    @Test
    public void pagNoDia(){
        try {
            boleto = new Boleto(100, 10, 0.25f, 0.15f);
            assertEquals(100, boleto.pagar(10));
        } catch (Exception e) {
            assertTrue(false);
        }
        
    }

    @DisplayName("Teste pagamento atrasado")
    @Test
    public void pagAtrasado(){
        try {
            boleto = new Boleto(100, 10, 0.25f, 0.15f);
            assertEquals(115, boleto.pagar(12));
        } catch (Exception e) {
            assertTrue(false);
        }
        
    }

    //Testes que devem dar erros:
    @DisplayName("Teste valor zero")
    @Test
    public void valorZero(){
        try {
            boleto = new Boleto(0, 10, 0.25f, 0.15f);
            fail("Devia ocorrer Exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @DisplayName("Teste valor negativo")
    @Test
    public void valorNegativo(){
        try {
            boleto = new Boleto(-1, 10, 0.25f, 0.15f);
            fail("Devia ocorrer Exception");
        } catch (Exception e) {
            assertTrue(true);
        }        
    }

    @DisplayName("Teste dia do vencimento nulo")
    @Test
    public void diaVencNulo(){
        try {
            boleto = new Boleto(100, 0, 0.25f, 0.15f);
            fail("Devia ocorrer Exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @DisplayName("Teste dia do vencimento negativo")
    @Test
    public void diaVencNegativo(){
        try {
            boleto = new Boleto(100, -10, 0.25f, 0.15f);
            fail("Devia ocorrer Exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @DisplayName("Teste percentual de desconto negativo")
    @Test
    public void percDescontoNegativo(){
        try {
            boleto = new Boleto(100, 10, -0.25f, 0.15f);
            fail("Devia ocorrer Exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @DisplayName("Teste percentual de multa negativo")
    @Test
    public void percMultaNegativo(){
        try {
            boleto = new Boleto(100, 10, 0.25f, -0.15f);
            fail("Devia ocorrer Exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @DisplayName("Teste dia do pagamento nulo")
    @Test
    public void diaPagNulo(){
        try {
            boleto = new Boleto(100, 10, 0.25f, 0.15f);
            boleto.pagar(0);
            fail("Devia ocorrer Exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @DisplayName("Teste dia do pagamento negativo")
    @Test
    public void diaPagNegativo(){
        try {
            boleto = new Boleto(100, 10, 0.25f, 0.15f);
            boleto.pagar(-10);
            fail("Devia ocorrer Exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
