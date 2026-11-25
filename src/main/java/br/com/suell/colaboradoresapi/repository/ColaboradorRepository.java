
package br.com.suell.colaboradoresapi.repository;

import br.com.suell.colaboradoresapi.model.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {

}
