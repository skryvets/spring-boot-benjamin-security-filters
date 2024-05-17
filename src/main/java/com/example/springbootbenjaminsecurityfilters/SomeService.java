package com.example.springbootbenjaminsecurityfilters;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SomeService {
    public void doingSomeDatabaseStuff() {
        log.info("Doing some database stuff");
    }
}
