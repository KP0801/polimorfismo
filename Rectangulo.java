 class Rectangulo extends Figura{

    public Rectangulo(int ancho, int largo) {
        super(ancho, largo);
        
    }
    

    public void PerimetroRectangulo(){
        System.out.println("Perimetro de Rectangulo es " +(2*getAncho())+(2*getlargo()));
    }
    
    public void AreaRectangulo(){
        System.out.println("Area de Rectangulo es "+ (getAncho()*getlargo()));
    }

}
