public class Main {
    public static void main(String[] args) {
        TelaVotacao telaVotacao = new TelaVotacao();
        TelaCadastroCandidato telaCadastroCandidato = new TelaCadastroCandidato();

        // Define que telaVotacao fica de olho nos dados vindos da telaCadastroCandidato
        telaCadastroCandidato.addObserver(telaVotacao);

        Candidato candidatoJoao = new Candidato("João Nicholas", 10, 10);

        // Insere um novo candidato na lista de cadastrados
        telaCadastroCandidato.cadastrarCandidato(candidatoJoao);

        Candidato candidatoWolfgang = new Candidato("Wolfgang Marcos", 24, 24);

        // Insere um novo candidato na lista de cadastrados
        telaCadastroCandidato.cadastrarCandidato(candidatoWolfgang);

        // Remove um candidato só de zoeira
        telaCadastroCandidato.removerCandidato(candidatoJoao);
    }
}
