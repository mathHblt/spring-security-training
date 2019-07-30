package arhs.training.springsecurity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;
    @Column(name = "PASSWORD", nullable = false)
    private String password;
    @Column(name = "ROLE", nullable = false)
    private String role;
    @Column(name = "PERMISSION", nullable = false)
    private String permission;

}