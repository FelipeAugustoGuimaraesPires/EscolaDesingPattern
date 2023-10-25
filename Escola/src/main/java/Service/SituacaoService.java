package service;


import Service.Aluno;

public abstract class SituacaoService {

    public abstract String processarSituacao(Aluno aluno);

    public abstract void setProximo(SituacaoService proximo);
}