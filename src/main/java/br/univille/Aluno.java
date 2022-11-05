package br.univille;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private float percFrequencia;
    private ArrayList<Avaliacao> listaNotas = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Exception{
        if(nome.equals("")){
            throw new Exception("Nome inválido");
        }else{
            if(!nome.substring(0, nome.length()).matches("(?i)[a-záàâãéèêíïóôõöúüçñ ]*")){
                throw new Exception("Nome inválido");
            }else{
                this.nome = nome;
            }
        }
    }

    public float getPercFrequencia() {
        return percFrequencia;
    }
    public void setPercFrequencia(float percFrequencia) throws Exception{
        if(percFrequencia < 0){
            throw new Exception("Valor inválido");
        }
        this.percFrequencia = percFrequencia;
    }
    
    public boolean estaEmExame(){
        float somaNotas = 0;
        float media = 0;
        for(int i = 0; i < getListaNotas().size(); i++){
            somaNotas = somaNotas + getListaNotas().get(i).getNota();
        }
        media = somaNotas/getListaNotas().size();
        if(media < 7 && media >= 3 && percFrequencia >= 0.75){
            return true;
        }else{
            return false;
        }
    }

    public boolean estaAprovado(){
        float somaNotas = 0;
        float media = 0;
        for(int i = 0; i < getListaNotas().size(); i++){
            somaNotas = somaNotas + getListaNotas().get(i).getNota();
        }
        media = somaNotas/getListaNotas().size();
        if(media >= 7 && percFrequencia >= 0.75){
            return true;
        }else{
            return false;
        }
    }

    public boolean estaReprovado(){
        float somaNotas = 0;
        float media = 0;
        for(int i = 0; i < getListaNotas().size(); i++){
            somaNotas = somaNotas + getListaNotas().get(i).getNota();
        }
        media = somaNotas/getListaNotas().size();
        if(media < 3 || percFrequencia < 0.75){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Avaliacao> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Avaliacao> listaNotas) {
        this.listaNotas = listaNotas;
    }
}
