package Model;

import Interface.IImprimir;
import Interface.IOperacaoMatematica;

public class Subtracao implements IOperacaoMatematica, IImprimir {

    @Override
    public double calcula(double valorUm, double valorDois) {
        return valorUm - valorDois;
    }

    @Override
    public void mostrarValor(double valor) {
        System.out.println("Resultado da Subtração: " + valor);
    }
}
