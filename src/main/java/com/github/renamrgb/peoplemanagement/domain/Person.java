package com.github.renamrgb.peoplemanagement.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Getter
@ToString
@RequiredArgsConstructor
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private LocalDate birthDate;
    private Set<Phone> phones;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Person person = (Person) o;
        return id != null && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
