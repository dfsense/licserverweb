package web.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users", schema = "licsrv")
public class User {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "")
    private Integer id;
}
