package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ImpostoDeRendaTest {
    private ImpostoDeRenda idr;

    @BeforeEach
    public void paraCada(){
        idr = new ImpostoDeRenda();
    }

    @DisplayName("Teste Percentual 7,50%")
    @Test
    public void testaPerc1(){
        try {
            Rendimento rend1 = new Rendimento("Descricao", 2500);
            Rendimento rend2 = new Rendimento("Descricao", 2000);
            Rendimento rend3 = new Rendimento("Descricao", 2000);
            Rendimento rend4 = new Rendimento("Descricao", 2000);
            Rendimento rend5 = new Rendimento("Descricao", 2000);
            Rendimento rend6 = new Rendimento("Descricao", 2000);
            Rendimento rend7 = new Rendimento("Descricao", 2000);
            Rendimento rend8 = new Rendimento("Descricao", 2500);
            Rendimento rend9 = new Rendimento("Descricao", 2500);
            Rendimento rend10 = new Rendimento("Descricao", 2500);
            Rendimento rend11 = new Rendimento("Descricao", 2500);
            Rendimento rend12 = new Rendimento("Descricao", 2500);
            idr.setImptoRetidonaFonte(1000);
            idr.getListaRendimentos().add(rend1);
            idr.getListaRendimentos().add(rend2);
            idr.getListaRendimentos().add(rend3);
            idr.getListaRendimentos().add(rend4);
            idr.getListaRendimentos().add(rend5);
            idr.getListaRendimentos().add(rend6);
            idr.getListaRendimentos().add(rend7);
            idr.getListaRendimentos().add(rend8);
            idr.getListaRendimentos().add(rend9);
            idr.getListaRendimentos().add(rend10);
            idr.getListaRendimentos().add(rend11);
            idr.getListaRendimentos().add(rend12);
            assertEquals(1025.0001220703125, idr.calculaValorIRPF());
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @DisplayName("Teste Percentual 15%")
    @Test
    public void testaPerc2(){
        try {
            Rendimento rend1 = new Rendimento("Descricao", 2500);
            Rendimento rend2 = new Rendimento("Descricao", 3500.50f);
            Rendimento rend3 = new Rendimento("Descricao", 3500.50f);
            Rendimento rend4 = new Rendimento("Descricao", 3500.50f);
            Rendimento rend5 = new Rendimento("Descricao", 3500.50f);
            Rendimento rend6 = new Rendimento("Descricao", 3500.50f);
            Rendimento rend7 = new Rendimento("Descricao", 3500.50f);
            Rendimento rend8 = new Rendimento("Descricao", 2500);
            Rendimento rend9 = new Rendimento("Descricao", 2500);
            Rendimento rend10 = new Rendimento("Descricao", 2500);
            Rendimento rend11 = new Rendimento("Descricao", 2500);
            Rendimento rend12 = new Rendimento("Descricao", 2500);
            idr.setImptoRetidonaFonte(1000);
            idr.getListaRendimentos().add(rend1);
            idr.getListaRendimentos().add(rend2);
            idr.getListaRendimentos().add(rend3);
            idr.getListaRendimentos().add(rend4);
            idr.getListaRendimentos().add(rend5);
            idr.getListaRendimentos().add(rend6);
            idr.getListaRendimentos().add(rend7);
            idr.getListaRendimentos().add(rend8);
            idr.getListaRendimentos().add(rend9);
            idr.getListaRendimentos().add(rend10);
            idr.getListaRendimentos().add(rend11);
            idr.getListaRendimentos().add(rend12);
            assertEquals(4400.4501953125, idr.calculaValorIRPF());
        } catch (Exception e) {
            assertTrue(false);
        }
    }
    
    @DisplayName("Teste Percentual 22,50%")
    @Test
    public void testaPerc3(){
        try {
            Rendimento rend1 = new Rendimento("Descricao", 3500);
            Rendimento rend2 = new Rendimento("Descricao", 4500);
            Rendimento rend3 = new Rendimento("Descricao", 4500);
            Rendimento rend4 = new Rendimento("Descricao", 4500);
            Rendimento rend5 = new Rendimento("Descricao", 4500);
            Rendimento rend6 = new Rendimento("Descricao", 4500);
            Rendimento rend7 = new Rendimento("Descricao", 4500);
            Rendimento rend8 = new Rendimento("Descricao", 3500);
            Rendimento rend9 = new Rendimento("Descricao", 3500);
            Rendimento rend10 = new Rendimento("Descricao", 3500);
            Rendimento rend11 = new Rendimento("Descricao", 3500);
            Rendimento rend12 = new Rendimento("Descricao", 3500);
            idr.setImptoRetidonaFonte(1000);
            idr.getListaRendimentos().add(rend1);
            idr.getListaRendimentos().add(rend2);
            idr.getListaRendimentos().add(rend3);
            idr.getListaRendimentos().add(rend4);
            idr.getListaRendimentos().add(rend5);
            idr.getListaRendimentos().add(rend6);
            idr.getListaRendimentos().add(rend7);
            idr.getListaRendimentos().add(rend8);
            idr.getListaRendimentos().add(rend9);
            idr.getListaRendimentos().add(rend10);
            idr.getListaRendimentos().add(rend11);
            idr.getListaRendimentos().add(rend12);
            assertEquals(9800, idr.calculaValorIRPF());
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @DisplayName("Teste Percentual 27,50%")
    @Test
    public void testaPerc4(){
        try {
            Rendimento rend1 = new Rendimento("Descricao", 10000);
            Rendimento rend2 = new Rendimento("Descricao", 12000);
            Rendimento rend3 = new Rendimento("Descricao", 12000);
            Rendimento rend4 = new Rendimento("Descricao", 12000);
            Rendimento rend5 = new Rendimento("Descricao", 12000);
            Rendimento rend6 = new Rendimento("Descricao", 12000);
            Rendimento rend7 = new Rendimento("Descricao", 12000);
            Rendimento rend8 = new Rendimento("Descricao", 10000);
            Rendimento rend9 = new Rendimento("Descricao", 10000);
            Rendimento rend10 = new Rendimento("Descricao", 10000);
            Rendimento rend11 = new Rendimento("Descricao", 10000);
            Rendimento rend12 = new Rendimento("Descricao", 10000);
            idr.setImptoRetidonaFonte(1000);
            idr.getListaRendimentos().add(rend1);
            idr.getListaRendimentos().add(rend2);
            idr.getListaRendimentos().add(rend3);
            idr.getListaRendimentos().add(rend4);
            idr.getListaRendimentos().add(rend5);
            idr.getListaRendimentos().add(rend6);
            idr.getListaRendimentos().add(rend7);
            idr.getListaRendimentos().add(rend8);
            idr.getListaRendimentos().add(rend9);
            idr.getListaRendimentos().add(rend10);
            idr.getListaRendimentos().add(rend11);
            idr.getListaRendimentos().add(rend12);
            assertEquals(35300, idr.calculaValorIRPF());
        } catch (Exception e) {
            assertTrue(false);
        }
    }
}
