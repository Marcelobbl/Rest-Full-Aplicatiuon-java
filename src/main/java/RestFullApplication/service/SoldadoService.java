package RestFullApplication.service;

import RestFullApplication.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf) {
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Marcelo");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e Flexa");
        return soldado;
    }

    public void criarSoldado(Soldado soldado){

    }

    public void deletarSoldado(String cpf) {

    }

    public List<Soldado> todosSoldados() {
        Soldado soldado1 = new Soldado();
        soldado1.setCpf("123456789");
        soldado1.setNome("Ricardo");
        soldado1.setRaca("Humano");
        soldado1.setArma("Bazuca");
        Soldado soldado2 = new Soldado();
        soldado2.setCpf("21436576");
        soldado2.setNome("Fábio");
        soldado2.setRaca("Elfo");
        soldado2.setArma("Metralhadora");

        return Arrays.asList(soldado1,soldado2);
    }
}
