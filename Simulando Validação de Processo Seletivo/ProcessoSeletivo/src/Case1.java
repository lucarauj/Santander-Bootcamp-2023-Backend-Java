import java.util.concurrent.ThreadLocalRandom;
public class Case1 {
    public static void main(String[] args) {
        Double valorPretendido = valorPretendido();
        Double salarioBase = 2000d;

        if(valorPretendido < salarioBase)
            System.out.println("LIGAR PARA O CANDIDADO");
        else if (valorPretendido == salarioBase)
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        else
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
