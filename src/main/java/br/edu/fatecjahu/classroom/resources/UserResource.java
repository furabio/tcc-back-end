package br.edu.fatecjahu.classroom.resources;

import br.edu.fatecjahu.classroom.domain.model.User;
import br.edu.fatecjahu.classroom.domain.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserResource extends AbstractResource<User, UserService> {
}
