import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        /** Sem usar lâmbda: [método test] */

        palavras.stream()
                .filter(
                        new Predicate<String>() {
                            @Override
                            public boolean test(String s) {
                                return s.length() > 5;
                            }
                        }
                )
                .forEach(System.out::println);

        System.out.println("***************");

        /** Usar lâmbda: */

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
}
