package com.github.renamrgb.peoplemanagement.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    HOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Commercial");
    private final String description;

}
