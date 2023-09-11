package pratricandoSuaAbstracaoNoDominioBancario;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

/*
    Requisitos:
    A classe deve ter um método chamado obterAnalisesDesempenho que recebe como parâmetros uma data inicial e uma data final.

    Entrada
    As datas inicial e final, no formato "dd/mm/aaaa", representando o intervalo de tempo desejado para consulta.

    Saída
    Uma lista contendo as análises de desempenho financeiro realizadas dentro do período especificado.
 */

public class ReuniaoDeAcionistas {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        String dataInicial = scanner.nextLine();
        String dataFinal = scanner.nextLine();

        SistemaAcionistas sistemaAcionistas = new SistemaAcionistas();
        List<String> analises = sistemaAcionistas.obterAnalisesDesempenho(dataInicial, dataFinal);

        for (String analise : analises) {
            System.out.println(analise);
        }
        scanner.close();
    }
}

class SistemaAcionistas {
    public List<String> obterAnalisesDesempenho(String dataInicialStr, String dataFinalStr) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicial = df.parse(dataInicialStr);
        Date dataFinal = df.parse(dataFinalStr);

        List<Analise> analises = new ArrayList<>();
        analises.add(new Analise(df.parse("01/01/2023"), "Analise de Desempenho Financeiro"));
        analises.add(new Analise(df.parse("15/02/2023"), "Analise de Riscos e Exposicoes"));
        analises.add(new Analise(df.parse("31/03/2023"), "Analises Corporativas"));
        analises.add(new Analise(df.parse("01/04/2023"), "Analise de Politicas e Regulamentacoes"));
        analises.add(new Analise(df.parse("15/05/2023"), "Analise de Ativos"));
        analises.add(new Analise(df.parse("30/06/2023"), "Analise de Inovacao e Tecnologia"));

        List<String> descricao = new ArrayList<>();
//        for(Date dtInicial = dataInicial; !dtInicial.after(dataFinal); dtInicial.setDate(dtInicial.getDate()+1)) {
//
//            for(int i = 0; i < 5; i++) {
//                if(dtInicial.equals(analises.get(i).data)){
//                    descricao.add(analises.get(i).descricao);
//                }
//            }
//        }
//        return descricao;
//    }

        for (Analise analise : analises) {
            if (dataEstaNoIntervalo(analise.data, dataInicial, dataFinal)) {
                descricao.add(analise.descricao);
            }
        }
        return descricao;
    }

    private boolean dataEstaNoIntervalo(Date data, Date dataInicial, Date dataFinal) {
        return data.compareTo(dataInicial) >= 0 && data.compareTo(dataFinal) <= 0;
    }

    class Analise {
        Date data;
        String descricao;

        public Analise(Date data, String descricao) {
            this.data = data;
            this.descricao = descricao;
        }
    }
}