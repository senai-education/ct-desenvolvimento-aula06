package calculadora;

import Interface.IOperacaoMatematica;
import Model.Divisao;
import Model.Exponenciacao;
import Model.Multiplicacao;
import Model.Soma;
import Model.Subtracao;
import java.util.Scanner;

public class Calculadora {

    
    public double resultado;
    
    public void mostraMenu(){
        String opcao = "0";
        double valorUm, valorDois;
        do{
            System.out.println("--------------------------------------");      
            System.out.println("----------MENU DA CALCULADORA---------");
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("SELECIONE UMA OPÇÃO PARA REALIZAR UM CALCULO");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - DIVISÃO");
            System.out.println("4 - MULTIPLICAÇÃO");
            System.out.println("5 - EXPONENCIAÇÃO");
            System.out.println("0 - SAIR");
            Scanner leitor = new Scanner(System.in);
            opcao = leitor.nextLine();
            if(!opcao.equals("0")){
                System.out.println("INFORME O PRIMEIRO VALOR");
                valorUm = leitor.nextDouble();
                System.out.println("INFORME O SEGUNDO VALOR");
                valorDois = leitor.nextDouble();
                chamaFuncoes(opcao, valorUm, valorDois);
            }    
        }while(!opcao.equals("0"));
        System.out.println("XAUUUUUUUU");
    }
   
    public void chamaFuncoes(String valor, double valorUm, double valorDois){
        switch(valor){
            case "1":
                Soma soma = new Soma();
                this.resultado = chama(soma, valorUm, valorDois);
                soma.mostrarValor(this.resultado);
                break;
            case "2":
                Subtracao sub = new Subtracao();
                this.resultado = chama(sub, valorUm, valorDois);
                sub.mostrarValor(this.resultado);
                break;
            case "3":
                Divisao div = new Divisao();
                this.resultado = chama(div, valorUm, valorDois);
                div.mostrarValor(this.resultado);
                break;
            case "4":
                Multiplicacao mult = new Multiplicacao();
                this.resultado = chama(mult, valorUm, valorDois);
                mult.mostrarValor(this.resultado);
                break;
            case "5":
                Exponenciacao exp = new Exponenciacao();
                this.resultado = chama(exp, valorUm, valorDois);
                exp.mostrarValor(this.resultado);
                break;
            default: 
                System.out.println("ESSA NÃO É UM OPÇÃO VÁLIDA!! TENTE OUTRA!");
        }
    }
    
    public double chama(IOperacaoMatematica operacao, double valorUm, double valorDois) {
        return operacao.calcula(valorUm, valorDois);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.mostraMenu();
    }
}
