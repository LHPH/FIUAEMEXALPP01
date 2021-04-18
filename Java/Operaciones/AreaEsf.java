package Operaciones;

public class AreaEsf {
    private float radio;
    private float area;
    
    public AreaEsf(float radio) {
        this.radio=radio;
        this.area=(float)((4.0f/3.0f)*Math.PI*radio);
    }
    
    public float getArea(){
        
        return area;
    }    
}

