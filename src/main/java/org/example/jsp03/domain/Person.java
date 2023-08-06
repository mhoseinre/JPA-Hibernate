package org.example.jsp03.domain;

import javax.persistence.*;

@Entity
@Table(name = Person.TABLE_NAME)
public class Person {
    public static final String TABLE_NAME="person";
    public static final String FARST_NAME="firstName";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = FARST_NAME)
    private String farstName;

    public String getFarstName() {
        return farstName;
    }
    public void setFarstName(String farstName) {
        this.farstName = farstName;
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Person() {
    }

}
