package api.server.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue
    private long id;

    private String roleName;

    public Role(){}
}
