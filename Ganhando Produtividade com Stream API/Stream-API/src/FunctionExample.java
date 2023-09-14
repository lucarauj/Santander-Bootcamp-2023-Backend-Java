import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */

public class FunctionExample {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrar = numero -> numero * 2;
        
        /** Sem usar lâmbda: [método apply] */

        List<Integer> numerosDobrados1 = numeros.stream()
                .map(
                        new Function<Integer, Integer>() {
                            @Override
                            public Integer apply(Integer integer) {
                                return integer * 2;
                            }
                        }
                )
                .toList();

        /** Usando lâmbda: Modo 1 */

        List<Integer> numerosDobrados2 = numeros.stream()
                .map(n -> n * 2)
                .toList();

        /** Usando lâmbda: Modo 2 */

        List<Integer> numerosDobrados3 = numeros.stream()
                .map(dobrar)
                .toList();

        numerosDobrados1.forEach(System.out::println);
        System.out.println("***********************");
        numerosDobrados2.forEach(System.out::println);
        System.out.println("***********************");
        numerosDobrados3.forEach(System.out::println);
    }
}
