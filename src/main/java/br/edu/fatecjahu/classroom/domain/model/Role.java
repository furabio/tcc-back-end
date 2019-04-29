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
@Table(name = "roles")
public class Role extends AbstractEntity {
    private static final long serialVersionUID = -2807622008383900081L;

    private String name;

}
