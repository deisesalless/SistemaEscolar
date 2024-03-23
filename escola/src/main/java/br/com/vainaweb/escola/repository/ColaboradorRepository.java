package br.com.vainaweb.escola.repository;

import br.com.vainaweb.escola.model.ColaboradorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepository extends JpaRepository<ColaboradorModel, Long> {
}
