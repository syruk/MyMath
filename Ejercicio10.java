package tema2;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        InnerMenu();
        String option = in.next();
        int number;
        switch (option) {
            case "1":
                System.out.println("Introduce el lado del cuadrado");
                double squareSide = in.nextDouble();
                System.out.println("El perímetro del cuadrado es " + (MyMath.squarePerimeter(squareSide)));
                System.out.println("Y su área es " + (MyMath.squareArea(squareSide)));
                break;
            case "2":
                System.out.println("Introduce la altura y la base del rectángulo");
                double rectangleHigh = in.nextDouble();
                double rectangleBase = in.nextDouble();
                System.out.println("El perímetro del rectángulo es " + (MyMath.rectanglePerimeter(rectangleHigh, rectangleBase)));
                System.out.println("Y su área es " + (MyMath.rectangleArea(rectangleHigh, rectangleBase)));
                break;
            case "3":
                System.out.println("Introduce el radio del círculo.");
                double circleRadius = in.nextDouble();
                System.out.println("El perímetro del círculo es " + (MyMath.circlePerimeter(circleRadius)));
                System.out.println("Y su área es " + (MyMath.circleArea(circleRadius)));
                break;
            case "4":
                System.out.println("Introduce un número para saber si es primo o no.");
                number = in.nextInt();
                if (MyMath.isPrime(number)) {
                    System.out.println("El número " + number + " es primo.");
                } else {
                    if (MyMath.isNotPrime(number))
                        System.out.println("El número " + number + " no es primo");
                }
                break;
            case "5":
                System.out.println("Introduce el número entero.");
                number = in.nextInt();
                System.out.println("El número de cifras del número " + number + " es " + MyMath.figureCount(number));
                break;
            case "6":
                System.out.println("Introduce el número entero.");
                number = in.nextInt();
                System.out.println("El número de cifras pares del número " + number + " es " + MyMath.evenFigureCount(number));
                break;
            case "7":
                System.out.println("Introduce el número entero.");
                number = in.nextInt();
                System.out.println("El número de cifras impares del número " + number + " es " + MyMath.oddFigureCount(number));
                break;
            case "8":
                System.out.println("Introduce un número entero para calcular su factorial: ");
                number = in.nextInt();
                System.out.println("El factorial de " + number + " es: " + (MyMath.factorial(number)));
                break;
            case "9":
                System.out.println("Introduce los tres coeficientes de la ecuación");
                int number1 = in.nextInt();
                int number2 = in.nextInt();
                int number3 = in.nextInt();
                System.out.println("El número de soluciones de la ecuación basada en los números" + number1 + ", " + number2 + ", " + number3 + " es: " + MyMath.quadraticEcuationSolutions(number1, number2, number3)) ;
                break;
            case "10":
                System.out.println("Introduce el número entero para sumar sus dígitos");
                number = in.nextInt();
                System.out.println("La suma de los dígitos de " + number + " es: " + (MyMath.figuresSumatory(number)));
                break;
            default:
                System.out.println("ERROR: Elige una opción válida.");
                break;
        }
    }
    public static void InnerMenu() {
        System.out.println("Escribe el número correspondiente para acceder al ejercicio:");
        System.out.println("1) Calcular el perímetro y el área de un cuadrado.\n" + //
                "2) Calcula el perímetro y el área de un rectángulo.\n" + //
                "3) Calcular el perímetro y el área de un círculo.\n" + //
                "4) Saber si un número es primo o no.\n" + //
                "5) Indicar el número de dígitos de un número entero.\n" + //
                "6) Indicar el número de dígitos pares de un número entero.\n" + //
                "7) Indicar el número de dígitos impares de un número entero.\n" + //
                "8) Calcular el factorial de un número.\n" + //
                "9) Introducir tres coeficientes de una ecuación de segundo grado y saber cuantas soluciones tiene la ecuación.\n" + //
                "10) Sumar los dígitos de un número entero.\n"
                 );
    }
}