package br.univille;

import java.util.ArrayList;

public class ImpostoDeRenda {
    private float ImptoRetidonaFonte;
    private ArrayList<Rendimento> listaRendimentos = new ArrayList<>();

    public void setImptoRetidonaFonte(float ImptoRetidonaFonte) {
        this.ImptoRetidonaFonte = ImptoRetidonaFonte;
    }

    public float calculaValorIRPF(){
        float somaRend = 0;
        float rendMes = 0;
        float valorIRPF = 0;
        
        for(int i = 0; i < getListaRendimentos().size(); i++){
            somaRend = somaRend + getListaRendimentos().get(i).getValor();
        }
        rendMes = somaRend/12;
        if(rendMes >= 1903.99 && rendMes <= 2826.65){
            valorIRPF = somaRend * 0.075f;
        }else{
            if(rendMes >= 2826.66 && rendMes <= 3751.05){
                valorIRPF = somaRend * 0.15f;
            }else{
                if(rendMes >= 3751.06 && rendMes <= 4664.68){
                    valorIRPF = somaRend * 0.225f;
                }else{
                    if(rendMes > 4664.68){
                        valorIRPF = somaRend * 0.275f;
                    }
                }
            }
        }
        valorIRPF = valorIRPF - ImptoRetidonaFonte;
        return valorIRPF;
    }
    
    public ArrayList<Rendimento> getListaRendimentos() {
        return listaRendimentos;
    }
    public void setListaRendimentos(ArrayList<Rendimento> listaRendimentos) {
        this.listaRendimentos = listaRendimentos;
    }
}
