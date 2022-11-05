package br.univille;

//import static org.junit.jupiter.api.Assertions.assertTrue;
//mport static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calc;

    @BeforeEach
    public void paraCada(){
        calc = new Calculadora();
    }

    //@AlgumaCoisa = Annotation
    //Testes Soma
    @DisplayName("Testa soma do valor com dois")
    @Test
    public void testaSomaDoisEDois(){
        //Calculadora calc = new Calculadora(); saiu por causa do @BeforeEach
        assertEquals(4, calc.soma(2, 2));
    }

    @DisplayName("Testa soma do valor com cinco")
    @Test
    public void somaDoisECinco(){
        assertEquals(7, calc.soma(2, 5));
    }

    //Testes Subtração
    @DisplayName("Testa subtração do valor com dois")
    @Test
    public void subtraiDoisEDois(){
        assertEquals(0, calc.subtracao(2, 2));
    }
    
    @DisplayName("Testa subtração do valor com cinco")
    @Test
    public void subtraiOitoECinco(){
        assertEquals(3, calc.subtracao(8, 5));
    }

    @DisplayName("Testa subtração do valor com numero maior")
    @Test
    public void subtraiDoisECinco(){
        assertEquals((-3), calc.subtracao(2, 5));
    }

    //Testes Multiplicação
    @DisplayName("Testa multiplicação do valor com dois")
    @Test
    public void multiplicaDoisEDois(){
        assertEquals(4, calc.multiplicacao(2, 2));
    }

    @DisplayName("Testa multiplicação do valor com cinco")
    @Test
    public void multiplicaDoisECinco(){
        assertEquals(10, calc.multiplicacao(2, 5));
    }

    //Testes Divisão
    @DisplayName("Testa divisão do valor com dois")
    @Test
    public void divideDezEDois(){
        assertEquals(5, calc.divisao(10, 2));
    }

    @DisplayName("Testa divisão do valor com cinco")
    @Test
    public void divideDezECinco(){
        assertEquals(2, calc.divisao(10, 5));
    }

    @DisplayName("Testa divisão de valores decimais")
    @Test
    public void divideUmEQuatro(){
        assertEquals(0.25f, calc.divisao(1f, 4f));
    }

    /*@DisplayName("Testa divisão do valor com zero")
    @Test
    public void divideDezEZero(){
        try{
            calc.divisao(10, 0);
            fail("Deveria ocorrer ArithmeticException");
        }catch(ArithmeticException e){
            assertTrue(true);
        }
        
    }*/

    @DisplayName("Testa divisão do valor com zero")
    @Test
    public void divideDezEZero(){
        assertThrows(ArithmeticException.class, () -> calc.divisao(10, 0));
    }
}
