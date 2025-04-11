package se.edugrade.membersapi.enteties;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String street;

    @Column(length = 100, nullable = false)
    private String postalCode;

    @Column(length = 100, nullable = false)
    private String city;

    public Address() {}

    public Address(String street, String postalCode, String city) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {

    }

}
