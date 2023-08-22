import java.util.concurrent.ThreadLocalRandom;

public class Case2 {

    public static void main(String[] args) {

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        Double salarioBase = 2000.0;
        Integer contador = 1;

        for (int i = 0; i < candidatos.length; i++) {
            Double salarioPretendido = valorPretendido();
            System.out.println("Analisando candidado: " + (i+1));
            System.out.println(candidatos[i]);
            System.out.println(salarioPretendido + "\n");
            if(salarioPretendido < salarioBase) {
                System.out.println("Candidato selecionado: " + candidatos[i] + " (" + contador + ")\n");
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
}
