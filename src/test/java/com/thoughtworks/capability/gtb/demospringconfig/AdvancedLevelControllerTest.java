package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("advanced")
public class AdvancedLevelControllerTest {

    @Autowired
    LevelController levelController;

    @Test
    public void should_return_advanced_when_level_number_more_than_one(){
        assertThat(levelController.getLevel().equals("advanced"));
    }
}
