package paquete;

public abstract class Figura {
    private String color;

    public Figura(){
        
    }
    
    public Figura(String color) {
        this.color = color;
    }
    
    public abstract void dibujar();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
