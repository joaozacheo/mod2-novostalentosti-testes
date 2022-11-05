package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlanejadorDeChurrascoTest {
    private PlanejadorDeChurrasco pdc;

    @BeforeEach
    public void paraCada(){
        pdc = new PlanejadorDeChurrasco();
    }

    @DisplayName("Testa um adulto")
    @Test
    public void umAdulto(){
        try {
            pdc.setAdulto(1);
        } catch (Exception e) {
            assertFalse(false);
        }
        assertEquals(250, pdc.calculaQtdCarne());
    }

    @DisplayName("Testa uma criança")
    @Test
    public void umaCrianca(){
        pdc.setCrianca(1);
        assertEquals(100, pdc.calculaQtdCarne());
    }

    @DisplayName("Testa um adulto e uma criança")
    @Test
    public void adultoECrianca(){
        try {
            pdc.setAdulto(1);
        } catch (Exception e) {
            assertFalse(false);
        }
        pdc.setCrianca(1);
        assertEquals(350, pdc.calculaQtdCarne());
    }

    @DisplayName("Testa três adultos e duas criancas")
    @Test
    public void tresAdultosEDuasCriancas(){
        try {
            pdc.setAdulto(3);
        } catch (Exception e) {
            assertFalse(false);
        }
        pdc.setCrianca(2);
        assertEquals(950, pdc.calculaQtdCarne());
    }

    @DisplayName("Testa adultos negativos")
    @Test
    public void adultosNegativos(){
        try{
            pdc.setAdulto(-1);
            fail("Devia ocorrer Exception");
        }catch(Exception e){
            assertTrue(true);
        }
    }
}
