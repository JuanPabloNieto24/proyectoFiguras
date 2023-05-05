package paquete;

public class Main {

    public static void main(String[] args) {
        
        Cuadrado c = new Cuadrado(5);
        c.area(c.getLado());
        c.perimetro(c.getLado());
        c.dibujar();
        System.out.println();
        
        Rectangulo r = new Rectangulo(3, 6);
        r.perimetro(r.getBase(),r.getAltura());
        r.area(r.getBase(),r.getAltura());
        r.dibujar();
        System.out.println();
        
        TrianguloRectangulo t = new TrianguloRectangulo(4, 5);
        t.calculoHipo(t.getBase(),t.getAltura());
        t.area(t.getBase(),t.getAltura());
        t.dibujar();
        System.out.println();
        
     
        
      
        
        
    }
    
}
