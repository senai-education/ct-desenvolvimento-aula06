package Model;

import Interface.IImprimir;
import Interface.IOperacaoMatematica;

public class Exponenciacao implements IOperacaoMatematica, IImprimir {

    @Override
    public double calcula(double valorUm, double valorDois) {
        return Math.pow(valorUm, valorUm);
    }

    @Override
    public void mostrarValor(double valor) {
        System.out.println("Resultado da exponenciacao: " + valor);
    }
    
}
