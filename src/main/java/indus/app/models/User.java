package indus.app.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Userr")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    private String password;

    private boolean active;

    private String roles;

    private String firstname;

    private String lastname;

    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id" ,referencedColumnName = "address_id")
    private Address address;
}
