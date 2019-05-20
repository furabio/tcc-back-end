package br.edu.fatecjahu.classroom.domain.service;

import br.edu.fatecjahu.classroom.application.exceptions.ClassroomException;
import br.edu.fatecjahu.classroom.domain.model.Period;
import br.edu.fatecjahu.classroom.infra.persistence.repository.PeriodRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PeriodService extends AbstractService<Period, PeriodRepository> {

    @Override
    public Period create(Period period) {
        validPeriod(period);
        return super.create(period);
    }

    @Override
    public Period update(Period period) {
        validPeriod(period);
        return super.update(period);
    }

    private void validPeriod(Period period) {
        if (period.getEnd().compareTo(period.getInit()) <= 0) {
            throw new ClassroomException("Periodo informado inválido!", HttpStatus.PRECONDITION_FAILED);
        }
        if (getRepository().findByInit(period.getInit()).isPresent()) {
            throw new ClassroomException("Data inicial informada já existente!", HttpStatus.PRECONDITION_FAILED);
        }
        if (getRepository().findByEnd(period.getEnd()).isPresent()) {
            throw new ClassroomException("Periodo final já existente!", HttpStatus.PRECONDITION_FAILED);
        }
    }
}
