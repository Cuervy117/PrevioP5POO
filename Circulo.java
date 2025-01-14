public class Circulo {
    
    private float radio;
    static float PI = 3.1416f;

    public float getRadio() {
        return radio;
    }
    
    public void setRadio(float radio) {
        if (radio < 0) {
            radio = 0;
        }
        this.radio = radio;
    }    
    
    public float perimetro() {
        return 2 * PI * radio;
    }
    
    public float area() {
        return PI * (radio * radio);
    }
    
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }
}
