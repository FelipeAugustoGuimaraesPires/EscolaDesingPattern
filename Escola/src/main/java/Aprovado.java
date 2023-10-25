
import Service.Aluno;
import service.SituacaoService;

public class Aprovado extends SituacaoService {

    private SituacaoService proximo;

    @Override
    public String processarSituacao(Aluno aluno) {
        if (aluno.getNota() >= 7) {
            return "Aprovado";
        } else {
            if (proximo != null) {
                return proximo.processarSituacao(aluno);
            } else {
                return "Situação indefinida";
            }
        }

    }

    @Override
    public void setProximo(SituacaoService proximo) {
        this.proximo = proximo;

    }
}
