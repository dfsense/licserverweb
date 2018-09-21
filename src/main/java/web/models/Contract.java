package web.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "contracts", schema = "licsrv")
public class Contract {
    @Id
    @Column(name = "id_contract", unique = true, nullable = false, updatable = false)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "contract_generator")
    @SequenceGenerator(name = "contract_generator", schema = "licsrv", sequenceName = "contracts_id_contract_seq", allocationSize = 1, initialValue = 1)
    private Integer id;

    @Column(name = "number_contract", length = 100, nullable = false, unique = true)
    private String contract;

    @Column(name = "date_expire", nullable = false, columnDefinition = "SELECT CURRENT_DATE")
    private Date dateExpire;

    @Column(name = "license_count", nullable = false, columnDefinition = "DEFAULT 0")
    private Integer licenseCapacity;

    @Column(name = "license_granted", nullable = false, columnDefinition = "DEFAULT 0")
    private Integer licenseGranted;

    @Column(name = "name_client", length = 100)
    private String client;

    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "license_type", nullable = false, columnDefinition = "DEFAULT 0")
    private Integer type;

    @Column(name = "public_key", nullable = false, length = 1024)
    private String publicKey;

    @Column(name = "config", length = 50000)
    private String config;

}
