package com.zain.smt.controller;

import com.zain.smt.work.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleController.class);

    private final Service service;

    public SimpleController(Service service) {
        this.service = service;
    }

    @RequestMapping("/test")
    public String test() {
        LOGGER.info("API called");
        service.execute();
        return "success";
    }
}
