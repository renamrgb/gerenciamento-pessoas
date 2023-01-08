package com.github.renamrgb.peoplemanagement.domain;

import com.github.renamrgb.peoplemanagement.domain.enums.PhoneType;
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

import java.util.Objects;

@Getter
@ToString
@RequiredArgsConstructor
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private PhoneType type;
    private String number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Phone phone = (Phone) o;
        return id != null && Objects.equals(id, phone.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
