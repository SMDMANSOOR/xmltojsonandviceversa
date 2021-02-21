package com.mansoor.xmltojsonandviceversa.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Address address;
}
