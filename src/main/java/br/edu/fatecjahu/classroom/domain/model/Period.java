package br.edu.fatecjahu.classroom.domain.model;

import br.edu.fatecjahu.classroom.domain.model.enums.PeriodTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "periods")
public class Period extends AbstractEntity {
    private static final long serialVersionUID = -8801871130575822889L;

    @NotNull
    private LocalTime init;

    @NotNull
    private LocalTime end;

    @NotNull
    private PeriodTypeEnum periodType;
}
