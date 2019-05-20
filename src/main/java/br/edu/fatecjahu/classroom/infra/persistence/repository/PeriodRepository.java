package br.edu.fatecjahu.classroom.infra.persistence.repository;

import br.edu.fatecjahu.classroom.domain.model.Period;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.Optional;

@Repository
public interface PeriodRepository extends JpaRepository<Period, Long> {
    Optional<Period> findByInit(LocalTime init);

    Optional<Period> findByEnd(LocalTime end);
}
