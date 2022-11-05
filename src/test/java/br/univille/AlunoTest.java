package br.univille;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlunoTest {
    private Aluno aluno;
    
    @BeforeEach
    public void paraCada(){
        aluno = new Aluno();
    }

    //Testes que devem dar certo:
    @DisplayName("Teste está aprovado")
    @Test
    public void testaAprovado(){
        try {
            Avaliacao avaliacao1 = new Avaliacao("Prova 1", 9);
            Avaliacao avaliacao2 = new Avaliacao("Prova 2", 10);
            aluno.setPercFrequencia(0.82f);
            aluno.getListaNotas().add(avaliacao1);
            aluno.getListaNotas().add(avaliacao2);
            assertEquals(true, aluno.estaAprovado());
            assertEquals(false, aluno.estaEmExame());
            assertEquals(false, aluno.estaReprovado());
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @DisplayName("Teste em exame")
    @Test
    public void testaEmExame(){
        try {
            Avaliacao avaliacao1 = new Avaliacao("Prova 1", 9);
            Avaliacao avaliacao2 = new Avaliacao("Prova 2", 4);
            aluno.setPercFrequencia(0.82f);
            aluno.getListaNotas().add(avaliacao1);
            aluno.getListaNotas().add(avaliacao2);
            assertEquals(false, aluno.estaAprovado());
            assertEquals(true, aluno.estaEmExame());
            assertEquals(false, aluno.estaReprovado());
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @DisplayName("Teste reprovado sem frequencia")
    @Test
    public void testaReprovadoFreq(){
        try {
            Avaliacao avaliacao1 = new Avaliacao("Prova 1", 9);
            Avaliacao avaliacao2 = new Avaliacao("Prova 2", 10);
            aluno.setPercFrequencia(0.4f);
            aluno.getListaNotas().add(avaliacao1);
            aluno.getListaNotas().add(avaliacao2);
            assertEquals(false, aluno.estaAprovado());
            assertEquals(false, aluno.estaEmExame());
            assertEquals(true, aluno.estaReprovado());
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @DisplayName("Teste reprovado sem nota")
    @Test
    public void testaReprovadoNota(){
        try {            
            Avaliacao avaliacao1 = new Avaliacao("Prova 1", 1);
            Avaliacao avaliacao2 = new Avaliacao("Prova 2", 4);
            aluno.setPercFrequencia(0.82f);
            aluno.getListaNotas().add(avaliacao1);
            aluno.getListaNotas().add(avaliacao2);
            assertEquals(false, aluno.estaAprovado());
            assertEquals(false, aluno.estaEmExame());
            assertEquals(true, aluno.estaReprovado());
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @DisplayName("Teste nome certo")
    @Test
    public void testaNomeCerto(){
        try{
            aluno.setNome("João Paulo");
        }catch(Exception e){
            assertTrue(false);
        }
    }

    //Testes que devem dar erros:
    @DisplayName("Teste frequencia negativa")
    @Test
    public void testaFreqNegativa(){
        try {
            aluno.setPercFrequencia(-0.86f);
            fail("Devia ocorrer Exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @DisplayName("Teste nome em branco")
    @Test
    public void testaNomeBranco(){
        try {
            aluno.setNome("");
            fail("Devia ocorrer Exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    
    @DisplayName("Teste nome inválido")
    @Test
    public void testaNomeInvalido(){
        try{
            aluno.setNome("123");
            fail("Devia ocorrer Exception");
        }catch(Exception e){
            assertTrue(true);
        }
    }
}
