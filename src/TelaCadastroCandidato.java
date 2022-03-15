import java.util.ArrayList;
import java.util.Observable;

public class TelaCadastroCandidato extends Observable {
    ArrayList<Candidato> listaCandidatosCadastrados = new ArrayList<>();

    public void cadastrarCandidato(Candidato novoCandidato) {
        listaCandidatosCadastrados.add(novoCandidato);
        setChanged();
        notifyObservers(listaCandidatosCadastrados);
    }

    public void removerCandidato(Candidato candidatoCadastrado) {
        listaCandidatosCadastrados.remove(candidatoCadastrado);
        setChanged();
        notifyObservers(listaCandidatosCadastrados);
    }
}
