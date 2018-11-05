package api.server.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String login;

    private String pass;

    @OneToOne(cascade = CascadeType.ALL)
    private Role role;

    //TODO add registration date

    private String email;

    private long phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public User(){ }
}
