package br.edu.fatecjahu.classroom.infra.persistence.repository;

import br.edu.fatecjahu.classroom.domain.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
