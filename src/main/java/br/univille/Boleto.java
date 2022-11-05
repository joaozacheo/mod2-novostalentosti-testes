package br.univille;

public class Boleto {
    private float valor;
    private int diaDoVencimento;
    private float percDesconto;
    private float percMulta;

    public Boleto(float valor, int diaDoVencimento, float percDesconto, float percMulta) throws Exception{
        if(valor <= 0 || diaDoVencimento <= 0 || percDesconto < 0 || percMulta < 0){
            throw new Exception("Valor inválido");
        }
        this.valor = valor;
        this.diaDoVencimento = diaDoVencimento;
        this.percDesconto = percDesconto;
        this.percMulta = percMulta;
    }

    public float getValor(){
        return valor;
    }

    public int getDiaDoVencimento(){
        return diaDoVencimento;
    }

    public float getPercDesconto(){
        return percDesconto;
    }

    public float getPercMulta(){
        return percMulta;
    }

    public float pagar(int diaDoPagamento) throws Exception{
        if(diaDoPagamento <= 0){
            throw new Exception("Valor Inválido");
        }
        float valorFinal = 0;
        if(diaDoPagamento < diaDoVencimento){
            valorFinal = valor - (valor * percDesconto);
        }else{
            if(diaDoPagamento > diaDoVencimento){
                valorFinal = valor + (valor * percMulta);
            }else{
                valorFinal = valor;
            }
        }
        return valorFinal;
    }
}
