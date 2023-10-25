
import Service.Aluno;
import service.SituacaoService;

public class Processador {

    private SituacaoService primeiro;

    public Processador() {
        SituacaoService reprovadoPorFalta = new ReprovadoPorFalta();
        SituacaoService reprovadoPorNota = new ReprovadoPorNota();
        SituacaoService exame = new Exame();
        SituacaoService aprovado = new Aprovado();

        reprovadoPorFalta.setProximo(reprovadoPorNota);
        reprovadoPorNota.setProximo(exame);
        exame.setProximo(aprovado);

        primeiro = reprovadoPorFalta;
    }

    public String processar(Aluno aluno) {
        return primeiro.processarSituacao(aluno);
    }
}
