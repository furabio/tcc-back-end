package br.edu.fatecjahu.classroom.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "classrooms")
public class Classroom extends AbstractEntity{
    private static final long serialVersionUID = -1134030103169187133L;

    private String name;
    private String description;
    private Integer number;
}
