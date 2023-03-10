package com.example.logging.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);


    @RequestMapping(path = "/")
    public String home() {
        LOGGER.trace("This is TRACE");
        LOGGER.debug("This is DEBUG");
        LOGGER.info("This is INFO");
        LOGGER.warn("This is WARN");
        LOGGER.error("This is ERROR");

        return "Привет, покажи логи в консоли или в файле!";
    }
}
