package br.com.compass.api.estados.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.compass.api.estados.entities.Estado;
import br.com.compass.api.estados.entities.Regioes;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

	Page<Estado> findByRegiao(Regioes regiao, Pageable paginacao);

}
