package ejercicio4;

public class LambdaTest4 {
    public static void main(String[] args) {
        CalculadoraLong calculadoraLong = (x, y) -> x + y;
        CalculadoraInt calculadoraInt = (x, y) -> x + y;
        engine(calculadoraInt);
        engine(calculadoraLong);
    }

    public static void engine(CalculadoraInt calculadoraInt){

    }

    public static void engine(CalculadoraLong calculadoraLong){

    }
}
