package com.mansoor.xmltojsonandviceversa.controller;

import com.mansoor.xmltojsonandviceversa.dto.Address;
import com.mansoor.xmltojsonandviceversa.dto.Employee;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

   @GetMapping(value="/jsonResponse", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> jsonResponse() {

      return ResponseEntity.ok().body(Employee.builder()
               .id(1)
               .firstName("abc xyz")
               .lastName("S")
               .age(100)
               .address(Address.builder()
                       .doorNo("1")
                       .addressLine(Arrays.asList("First Floor", "xxx"))
                       .landMark("yyy")
                       .zipCode("000000")
                       .build())
               .build());

    }


}
