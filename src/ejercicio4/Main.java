package ejercicio4;

public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(10, 5));
    }

    private static CalculadoraLong create(){
        long var = 2l;
        return (x, y) -> { return x / y + var;};
    }
}
