package br.edu.fatecjahu.classroom.resources;

import br.edu.fatecjahu.classroom.domain.model.Period;
import br.edu.fatecjahu.classroom.domain.service.PeriodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/periods")
public class PeriodResource extends AbstractResource<Period, PeriodService>{
}
