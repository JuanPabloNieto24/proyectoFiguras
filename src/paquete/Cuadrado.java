package paquete;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }
    
    public double perimetro(double lado){
        double res =  2 * (lado + lado);
        System.out.println("El perímetro del cuadrado es: " + res + " u");
        return res;
    }
    
    public double area(double lado){
        double res = lado * lado;
        System.out.println("El área del cuadrado es: " + res + " u^2");
        return res;
    }

    @Override
    public void dibujar(){
        for(int i=1; i<= lado; i++){
            for(int j=1; j<= lado; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
