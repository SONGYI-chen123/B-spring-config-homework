package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = {"levelNumber=2"})
public class AdvancedLevelControllerTest {
    @Autowired
    LevelController levelController;
    @Test
    void should_return_advanced_when_level_number_more_than_one(){
        assertThat(levelController.getLevel().equals("advanced"));
    }
}
