package paquete;

import java.text.DecimalFormat;

public class TrianguloRectangulo extends Figura{
    private int base;
    private int altura;

    public TrianguloRectangulo() {
    }

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public TrianguloRectangulo(int base, int altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double calculoHipo(double base, double altura){
        DecimalFormat formato = new DecimalFormat("#.##");
        double res = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        System.out.println("La hipotenusa del triángulo rectángulo es: " + formato.format(res) + " u");
        return res;
    }

    public double area(double base, double altura){
        double res = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + res + " u^2");
        return res;
    }
    
    @Override
    public void dibujar(){
        for(int i=0; i<=base; i++){
            for(int j=0; j<=altura; j++){
                if(j<=i) System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}