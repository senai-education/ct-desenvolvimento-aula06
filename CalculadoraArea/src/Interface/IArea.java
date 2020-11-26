package Interface;

import java.util.ArrayList;
import java.util.Scanner;

public interface IArea {
    
    public void calculoArea(ArrayList<Double> valores);
    
    public default ArrayList<Double> mostraMenu(){
        ArrayList<Double> arrayValores = new ArrayList();
        Scanner leitor = new Scanner(System.in);
        System.out.println("INFORME O VALOR LADO A");
        arrayValores.add(leitor.nextDouble());
        System.out.println("INFORME O VALOR LADO B");
        arrayValores.add(leitor.nextDouble());
        return arrayValores;
    }
}
