package Interface;

import java.util.ArrayList;
import java.util.Scanner;

public interface IArea {
    
    public double calculoArea(double valorUm, double valorDois);
    
    public default ArrayList<Double> mostraMenu(){
        ArrayList<Double> arrayValores = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        System.out.println("INFORME O VALOR DA LARGURA");
        arrayValores.add(leitor.nextDouble());
        System.out.println("INFORME O VALOR DA LARGURA");
        arrayValores.add(leitor.nextDouble());
        return arrayValores;
    }
    
}
