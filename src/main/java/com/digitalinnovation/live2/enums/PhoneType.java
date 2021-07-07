
package com.digitalinnovation.live2.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("home"),
    MOBILE("mobile"),
    COMMERCIAL("commercial");

    private final String description;
}