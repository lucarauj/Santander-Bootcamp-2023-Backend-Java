import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Case4 {
    public static void main(String[] args) {

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        Double salarioBase = 2000.0;
        Integer contador = 1;

        for (int i = 0; i < candidatos.length; i++) {
            Double salarioPretendido = valorPretendido();

            if(salarioPretendido < salarioBase) {
                System.out.println("Candidato(a): " + candidatos[i] + "\n");
                entrandoEmContato();
                System.out.println("\n#####################################\n");
                contador++;
            }
            if(contador == 6) {
                break;
            }
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static boolean atender() { return new Random().nextInt(3)==1; }

    static void entrandoEmContato() {
        int ligacoes = 1;
        while (ligacoes < 4) {
            if(atender()) {
                System.out.println("CONSEGUIMOS CONTATO (Tentativa: " + ligacoes + ")");
                break;
            }
            System.out.println("NÃO CONSEGUIMOS CONTATO (Tentativa: " + ligacoes + ")");
            ligacoes++;
        }
    }
}
