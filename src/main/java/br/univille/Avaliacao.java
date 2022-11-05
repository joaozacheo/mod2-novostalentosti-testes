package br.univille;

public class Avaliacao {
    private String descricao;
    private float nota;

    public Avaliacao(String descricao, float nota) throws Exception{
        if(nota < 0){
            throw new Exception("Nota inválida");
        }
        this.descricao = descricao;
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public float getNota() {
        return nota;
    }
    
}
