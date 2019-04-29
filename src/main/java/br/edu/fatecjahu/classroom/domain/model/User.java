package br.edu.fatecjahu.classroom.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User extends AbstractEntity {
    private static final long serialVersionUID = -2445140250146097156L;

    private String username;
    private String password;
    private String email;
    private String fullName;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}
