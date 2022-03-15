import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class TelaVotacao implements Observer {

    /**
     * Chamado sempre que a lista de candidatos mudar
     */
    @Override
    public void update(Observable origemAtualizacao, Object dadosAtualizados) {
        System.out.println("Ei, eu recebi uma nova lista de candidatos!");
        System.out.println("Hora de atualizar o combobox");

        System.out.println("Segue lista de candidatos recebida:");

        ArrayList<Candidato> listaCandidatosRecebidos = (ArrayList<Candidato>) dadosAtualizados;

        for (Candidato candidato : listaCandidatosRecebidos) {
            System.out.println(candidato);
        }

        System.out.println("-- Fim da atualização da tela de votação! --");
    }
}
