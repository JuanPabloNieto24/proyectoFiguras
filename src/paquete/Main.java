package paquete;

public class Main {

    public static void main(String[] args) {
        
        Cuadrado c = new Cuadrado(5, "Rojo");
        c.dibujar();
        System.out.println();
        Rectangulo r = new Rectangulo(3, 6);
        r.dibujar();
        System.out.println();
        TrianguloRectangulo t = new TrianguloRectangulo(4, 5);
        t.dibujar();
        
//        Figura[] figuras = new Figura[3];
//        figuras[0] = c;
//        figuras[1] = r;
//        figuras[2] = t;
//        
//        for(int i=0; i<figuras.length; i++){
//            Figura f = figuras[i];
//            f.dibujar();
//            System.out.println();
//        }


        
        
    }
    
}
