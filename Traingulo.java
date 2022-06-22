class Traingulo extends Figura {


    private int altura;

    public Traingulo(int ancho, int largo,int altura) {
        super(ancho, largo);
        this.altura=altura;
    }
    
    public void setAltura(int altura){
        this.altura=altura;
    }
    
    public int getAltura(){
        return altura;
    }

    public void PerimetroTriangulo(){
        System.out.println("Perimetro de un triangulo "+ (getAltura()*3));
    }

    public void AreaTriangulo(){
        System.out.println("Area de un triangulo "+(  Math.sqrt(3)/4 * (Math.pow(getAltura(), 2) ) )   ) ;
    }

    

}
