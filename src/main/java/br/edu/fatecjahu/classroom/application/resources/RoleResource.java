package br.edu.fatecjahu.classroom.application.resources;

import br.edu.fatecjahu.classroom.domain.model.Role;
import br.edu.fatecjahu.classroom.domain.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/roles")
public class RoleResource extends AbstractResource<Role, RoleService>{
}
