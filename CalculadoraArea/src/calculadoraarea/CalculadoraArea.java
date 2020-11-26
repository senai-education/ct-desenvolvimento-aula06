package calculadoraarea;

import Model.Circulo;
import Model.Quadrado;
import Model.Retangulo;
import java.util.Scanner;

public class CalculadoraArea {
    
    public void chamaFuncoes(String valor){
        switch(valor){
            case "1":
                Circulo c = new Circulo();
                c.calculoArea(c.mostraMenu());
                c.mostrarValor();
                break;
            case "2":
                Quadrado q = new Quadrado();
                q.calculoArea(q.mostraMenu());
                q.mostrarValor();
                break;
            case "3":
                Retangulo r = new Retangulo();
                r.calculoArea(r.mostraMenu());
                r.mostrarValor();
                break;
            default: 
                System.out.println("ESSA NÃO É UM OPÇÃO VÁLIDA!! TENTE OUTRA!");
        }
    }
    
    public void mostraMenu(){
        String opcao = "0";
        do{
            System.out.println("--------------------------------------");      
            System.out.println("----------MENU DA CALCULADORA AREA---------");
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("SELECIONE UMA OPÇÃO PARA REALIZAR UM CALCULO");
            System.out.println("1 - CIRCULO");
            System.out.println("2 - QUADRADO");
            System.out.println("3 - RETANGULO");
            System.out.println("0 - SAIR");
            Scanner leitor = new Scanner(System.in);
            opcao = leitor.nextLine();
            if(!opcao.equals("0")){
                chamaFuncoes(opcao);
            }    
        }while(!opcao.equals("0"));
        System.out.println("XAUUUUUUUU");
    }
    public static void main(String[] args) {
        CalculadoraArea c = new CalculadoraArea();;;
        c.mostraMenu();
    }
    
}
