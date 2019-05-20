package br.edu.fatecjahu.classroom.domain.service;

import br.edu.fatecjahu.classroom.domain.model.Classroom;
import br.edu.fatecjahu.classroom.infra.persistence.repository.ClassroomRepository;
import org.springframework.stereotype.Service;

@Service
public class ClassroomService extends AbstractService<Classroom, ClassroomRepository> {
}
