import java.util.Scanner;

public class PruebaFigurasGeometricas {
    public static void main(String[] args) {
        
        System.out.println("/***********************/");
        Scanner opcion = new Scanner(System.in);
        System.out.println("Seleccione que figura desea cualcular:");
        System.out.println("1= Círculo");
        System.out.println("2= Rectángulo");
        System.out.println("3= Cuadrado");
        System.out.println("4= Triangulo");
        System.out.println("/***********************/");
        
        int caso = opcion.nextInt();
        

        switch (caso) {
        case 1:
        System.out.println("/***********************/");
        System.out.println("Circulo");
        Scanner num = new Scanner(System.in);
        System.out.print("Radio del círculo: ");
        double radioCirculo = num.nextDouble();
        Circulo circulo = new Circulo(radioCirculo);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
        System.out.println("/***********************/");
        break;

        case 2:
        System.out.println("/***********************/");
        System.out.println("Rectángulo");    
        Scanner num1 = new Scanner(System.in);
        System.out.print("Base del rectángulo: ");
        double baseRectangulo = num1.nextDouble();
        System.out.print("Altura del rectángulo: ");
        double alturaRectangulo = num1.nextDouble();
        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        System.out.println("/***********************/");
        break;

        case 3:
        System.out.println("/***********************/");
        System.out.println("Cuadrado");
        Scanner num2 = new Scanner(System.in);
        System.out.print("Lado del cuadrado: ");
        double ladoCuadrado = num2.nextDouble();
        Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro()); 
        System.out.println("/***********************/");
        break;


        case 4:
        System.out.println("/***********************/");
        System.out.println("Triangulo");
        Scanner num3 = new Scanner(System.in);
        System.out.print("Lado 1 del triángulo: ");
        double lado1Triangulo = num3.nextDouble();
        System.out.print("Lado 2 del triángulo: ");
        double lado2Triangulo = num3.nextDouble();
        System.out.print("Lado 3 del triángulo: ");
        double lado3Triangulo = num3.nextDouble();
        Triangulo triangulo = new Triangulo(lado1Triangulo, lado2Triangulo, lado3Triangulo);
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Tipo de triángulo: " + triangulo.determinarTipoTriangulo());
        System.out.println("/***********************/");
        break;
     }

    opcion.close();
    }
}