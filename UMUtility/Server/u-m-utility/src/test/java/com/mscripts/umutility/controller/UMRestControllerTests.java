package com.mscripts.umutility.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class UMRestControllerTests {
    
    @Autowired
    ApplicationContext context;

    @Test
    void contextLoads() {
        System.out.println(context);
    }

    @Test
    void checkRootHandlerResponseBody() {
		UMRestController umRestController = context.getBean(UMRestController.class);
		ResponseEntity<String> responseEntity = umRestController.rootRequestHandler();
		assertEquals("<h1>Hello, World!!!</h1><hr><h3>Welcome to User Migration Utility</h3>", responseEntity.getBody());
	}

    @Test
	void checkRootHandlerResponseStatus() {
		UMRestController umRestController = context.getBean(UMRestController.class);
		ResponseEntity<String> responseEntity = umRestController.rootRequestHandler();
		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

}
