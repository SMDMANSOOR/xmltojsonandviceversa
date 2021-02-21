package com.mansoor.xmltojsonandviceversa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mansoor.xmltojsonandviceversa")
public class XmltojsonandviceversaApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmltojsonandviceversaApplication.class, args);
	}

}
