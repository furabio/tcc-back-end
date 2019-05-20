package br.edu.fatecjahu.classroom.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "classrooms")
public class Classroom extends AbstractEntity {
    private static final long serialVersionUID = -1134030103169187133L;

    @NotEmpty
    @NotNull
    @Max(value = 50)
    private String name;
    @NotEmpty
    @NotNull
    private String description;

    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL)
    private List<Booking> booking;
}
