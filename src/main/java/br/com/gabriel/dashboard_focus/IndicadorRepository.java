package br.com.gabriel.dashboard_focus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndicadorRepository extends JpaRepository<Indicador, Long> {
}