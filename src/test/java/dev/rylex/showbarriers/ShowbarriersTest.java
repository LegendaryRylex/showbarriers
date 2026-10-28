package dev.rylex.showbarriers;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ShowbarriersTest {
    @Test
    void modIdIsValid() {
        assertTrue(Showbarriers.MOD_ID.matches("[a-z][a-z0-9_]{1,63}"));
    }
}
