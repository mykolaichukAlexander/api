package api.server.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue
    private long id;

    private String region;

    private String district;

    private String city;
}
