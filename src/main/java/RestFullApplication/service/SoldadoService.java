package RestFullApplication.service;

import RestFullApplication.dto.Soldado;
import org.springframework.stereotype.Service;

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
}
