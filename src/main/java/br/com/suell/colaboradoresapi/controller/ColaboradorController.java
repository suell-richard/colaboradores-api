
package br.com.suell.colaboradoresapi.controller;

import br.com.suell.colaboradoresapi.model.Colaborador;
import br.com.suell.colaboradoresapi.service.ColaboradorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    private final ColaboradorService service;

    public ColaboradorController(ColaboradorService service) {
        this.service = service;
    }

    @PostMapping
    public Colaborador salvar(@RequestBody Colaborador colaborador) {
        return service.salvar(colaborador);
    }

    @GetMapping
    public List<Colaborador> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Colaborador buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Colaborador atualizar(
            @PathVariable Long id,
            @RequestBody Colaborador colaborador) {
        return service.atualizar(id, colaborador);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}
