package com.fisglobal;


import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void gitHutActionsPoc() {
        Random random = new Random();
        int rand = random.nextInt(100);

        assertTrue(rand < 50);
    }
}
