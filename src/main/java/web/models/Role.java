package web.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "roles", schema = "licsrv")
public class Role {
    @Id
    @Column(name = "id_role")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_generator")
    @SequenceGenerator(name = "role_generator", sequenceName = "roles_id_role_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String userName;

    @Column(name = "password", length = 100, nullable = false, unique = true)
    private String password;

    @Transient
    private String confirmPassword;

    @ManyToMany
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "id_role"),
            inverseJoinColumns = @JoinColumn(name = "id_role"))
    private Set<User> users;


}
