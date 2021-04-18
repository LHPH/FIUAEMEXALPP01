package Operaciones;

public class Triangulo{
    private int alto;
    private int anchura;
    private float area;
    
    public Triangulo(int alto,int anchura) {
        this.alto=alto;
        this.anchura=anchura;
        this.area=(alto*anchura)/2.0f;
    }


    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAlto() {
        return alto;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAnchura() {
        return anchura;
    }
    
    public float getArea(){
        return area;
    }
}
