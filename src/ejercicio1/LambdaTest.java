package ejercicio1;

public class LambdaTest {

    public static void main(String[] args){

        FunctionTest helloFunction = () -> System.out.println("Hola mundo!");
        miMetodo(helloFunction);
    }

    private static void miMetodo(FunctionTest parametroSaludar){
        parametroSaludar.saludar();
    }
}
