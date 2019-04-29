package br.edu.fatecjahu.classroom.resources;

import br.edu.fatecjahu.classroom.domain.model.Classroom;
import br.edu.fatecjahu.classroom.domain.service.ClassroomService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/classrooms")
public class ClassroomResource extends AbstractResource<Classroom, ClassroomService> {
}
