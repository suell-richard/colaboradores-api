
package br.com.suell.colaboradoresapi.service;

import br.com.suell.colaboradoresapi.model.Colaborador;
import br.com.suell.colaboradoresapi.repository.ColaboradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColaboradorService {

    private final ColaboradorRepository repository;

    public ColaboradorService(ColaboradorRepository repository) {
        this.repository = repository;
    }

    public Colaborador salvar(Colaborador colaborador) {
        return repository.save(colaborador);
    }

    public List<Colaborador> listarTodos() {
        return repository.findAll();
    }

    public Colaborador buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Colaborador não encontrado"));
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
    public Colaborador atualizar(Long id, Colaborador novosDados) {
        Colaborador colaborador = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Colaborador não encontrado"));

        colaborador.setNome(novosDados.getNome());
        colaborador.setEmail(novosDados.getEmail());
        colaborador.setCargo(novosDados.getCargo());
        colaborador.setSetor(novosDados.getSetor());

        return repository.save(colaborador);
    } }

