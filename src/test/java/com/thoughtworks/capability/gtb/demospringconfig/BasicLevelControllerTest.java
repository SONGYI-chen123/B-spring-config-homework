package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = {"levelNumber=0"})
public class BasicLevelControllerTest {
    @Autowired
    LevelController levelController;
    @Test
    void should_return_advanced_when_level_number_less_than_one(){
        assertThat(levelController.getLevel().equals("basic"));
    }
}
