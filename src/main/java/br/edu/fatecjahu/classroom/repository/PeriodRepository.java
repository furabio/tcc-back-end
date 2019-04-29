package br.edu.fatecjahu.classroom.repository;

import br.edu.fatecjahu.classroom.domain.model.Period;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodRepository extends JpaRepository<Period, Long> {
}
