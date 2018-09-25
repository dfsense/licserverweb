package web.models;


import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "users", schema = "licsrv")
public class User {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "users_id_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "name", nullable = false, length = 255, unique = true)
    private String userName;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Transient
    private String confirmPassword;

    @ManyToMany
    @JoinTable(schema = "licsrv", name = "user_roles", joinColumns = @JoinColumn(name = "id_user"),
            inverseJoinColumns = @JoinColumn(name = "id_role"))
    private Set<Role> roles;
}
