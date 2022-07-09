import java.util.InputMismatchException;
import java.util.Scanner;
import mipackage.Coche;


public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int param = 0;
        int param2 = 0;
        int param3 = 0;
        int count = 0;
        int result = 0;


        while (count <= 2) {
            try {
                System.out.println("Escriba un número entero: ");
                if (count == 0)
                    param = leer.nextInt();
                else if (count == 1)
                    param2 = leer.nextInt();
                else
                    param3 = leer.nextInt();

                count = count + 1;
            }
            catch (InputMismatchException ex){
                System.out.println("Debe ingresar un número entero");
                leer.next();
                count = count;
            }
        }

        result = Suma(param,param2,param3);
        System.out.println("El resultado de la suma es: " + result);

        Coche car = new Coche();
        car.setNumPuertas(4);
        System.out.println("Número de puertas inicial: " + car.getNumPuertas());
        car.incrementaPuertas(1);
        System.out.println("Número de puerats final: " + car.getNumPuertas());
    }

    private static int Suma(int a,int b,int c){
        int res;

        res = a + b + c;
        return res;
    }


}