package br.com.casannova.casamed.repositories;

import br.com.casannova.casamed.entities.Prescricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescricaoRepository extends JpaRepository<Prescricao, Long> {
}
