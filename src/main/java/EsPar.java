
import java.util.Scanner;

public class EsPar {//Nombre de la clase

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//objeto de la clase scanner
        int n;
        System.out.print("Escribe el numero y te digo si es par o no: ");//imprimir la pregunta escrita
        n = teclado.nextInt();//guardar el numero que se introdusca
        if (n % 2 == 0) {//si n%2=0 es par y si no impar por ejempplo
            System.out.println("El numero: " + n + " es par");//n=6 6%2=0 es par
        } else {//si no
            System.out.println("El numero: " + n + " es impar");//si n no es cero es impar n=3%2=1
        }
    }
}
