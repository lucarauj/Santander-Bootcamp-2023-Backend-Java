import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

public class BinaryOperatorExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = Integer::sum;

        /** Usando [new BinaryOperator] método apply */

        int resultado1 = numeros.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer int1, Integer int2) {
                        return int1 + int2;
                    }
                });

        int resultado2 = numeros.stream()
                .reduce(0, Integer::sum); // Integer::sum == (n1, n2) -> n1 + n2

        System.out.println("Soma dos números: " + resultado1);
        System.out.println("*******************************");
        System.out.println("Soma dos números: " + resultado2);
    }
}
