package com.mansoor.xmltojsonandviceversa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {
    private String doorNo;
    private List<String> addressLine;
    private String landMark;
    private String zipCode;
}
