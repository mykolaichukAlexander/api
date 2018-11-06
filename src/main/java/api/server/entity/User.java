package api.server.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "users")
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String login;

    private String pass;

    @OneToOne(cascade = CascadeType.ALL)
    private Role role;

    //@Temporal(TemporalType.TIMESTAMP)
    private Timestamp registrationDate;

    private String email;

    private long phone;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;


}
