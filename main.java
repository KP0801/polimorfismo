import java.util.*;

public class main{


    public static void main(String[] args){

        Figura Cuadrado1 = new Cuadrado(20, 20);
        Figura Triangulo1 = new Traingulo(20, 20, 20);
        Figura Rectangulo1 = new Rectangulo(15, 13);


        ((Cuadrado) Cuadrado1).AreaCuadrado();
        ((Traingulo) Triangulo1).PerimetroTriangulo();
        ((Rectangulo) Rectangulo1).AreaRectangulo();

    }

}