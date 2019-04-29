package br.edu.fatecjahu.classroom.domain.model;

import br.edu.fatecjahu.classroom.domain.enums.PeriodTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "periods")
public class Period extends AbstractEntity {
    private static final long serialVersionUID = -8801871130575822889L;

    private LocalDateTime init;
    private LocalDateTime end;
    private PeriodTypeEnum periodType;

}
