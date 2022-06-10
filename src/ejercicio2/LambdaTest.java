package ejercicio2;

public class LambdaTest {
    public static void main(String [] args){
        miMetodo((num1, num2) -> System.out.println(num1 + num2), 25, 30);
    }

    private static void miMetodo(Operaciones parametro, int num1, int num2){
        parametro.imprimirOperacion(num1,num2);
    }
}
