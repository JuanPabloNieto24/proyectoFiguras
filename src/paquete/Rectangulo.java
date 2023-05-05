package paquete;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double perimetro(double base, double altura){
        double res = 2 * (base + altura);
        System.out.println("El perímetro del rectángulo es: " + res + " u");
        return res;
    }
    
    public double area(double base, double altura){
        double res = base * altura;
        System.out.println("El área del rectángulo es: " + res + " u^2");
        return res;
    }
    
    @Override
    public void dibujar(){
        for(int i=1; i<=base; i++){
            for(int j=1; j<=altura; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
