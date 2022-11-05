package br.univille;

public class PlanejadorDeChurrasco {
    private int adulto;
    private int crianca;

    public void setAdulto(int adulto) throws Exception{
        if(adulto < 0){
            throw new Exception("Número Inválido");
        }
        this.adulto = adulto;
    }

    public void setCrianca(int crianca){
        this.crianca = crianca;
    }

    public float calculaQtdCarne(){
        float qtdAdulto = adulto * 250;
        float qtdCrianca = crianca * 100;
        float qtdTotal = qtdAdulto + qtdCrianca;
        return qtdTotal;
    }
}
