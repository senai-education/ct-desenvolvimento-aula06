package Model;

import Interface.IArea;
import Interface.IImprimir;
import java.util.ArrayList;
import java.util.Scanner;

public class Circulo implements IArea, IImprimir {

    public final double PI = 3.14;
    public double area = 0.0;

    @Override
    public void calculoArea(ArrayList<Double> valores) {
        this.area = Math.pow(valores.get(0), 2) * this.PI;
    }

    @Override
    public ArrayList<Double> mostraMenu() {
        ArrayList<Double> arrayValores = new ArrayList();
        Scanner leitor = new Scanner(System.in);;
        System.out.println("INFORME O RAIO");
        arrayValores.add(leitor.nextDouble());
        return arrayValores;
    }

    @Override
    public void mostrarValor() {
        System.out.println("O RESULTADO É: " + area);
    }
}
