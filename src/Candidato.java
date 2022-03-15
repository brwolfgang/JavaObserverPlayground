public class Candidato {
    private String nome;
    private int numeroPartido;
    private int numeroVotacao;

    public Candidato(String nome, int numeroPartido, int numeroVotacao) {
        this.nome = nome;
        this.numeroPartido = numeroPartido;
        this.numeroVotacao = numeroVotacao;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", numeroPartido=" + numeroPartido +
                ", numeroVotacao=" + numeroVotacao +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPartido() {
        return numeroPartido;
    }

    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public int getNumeroVotacao() {
        return numeroVotacao;
    }

    public void setNumeroVotacao(int numeroVotacao) {
        this.numeroVotacao = numeroVotacao;
    }
}
