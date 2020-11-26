package Model;

import Interface.IArea;
import Interface.IImprimir;
import java.util.ArrayList;

public class Retangulo implements IArea, IImprimir {
    
    public double area = 0.0;
    
    @Override
    public void calculoArea(ArrayList<Double> valores) {
        this.area = valores.get(0) * valores.get(1);
    }

    @Override
    public void mostrarValor() {
        System.out.println("O RESULTADO É: " + this.area);
    }

}
