class Cuadrado extends Figura{

    public Cuadrado(int ancho, int largo) {
        super(ancho, largo);
       
    }
    

    public void AreaCuadrado(){
        System.out.println("area del cuadrado es "+ Math.pow(getlargo(), 2));

    }

    public void PerimetroCuadrado(){
        System.out.println("Perimetro del cuadrado es "+ (getAncho()*4));

    }

 

    


}
