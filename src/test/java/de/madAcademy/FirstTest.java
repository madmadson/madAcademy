package de.madAcademy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {

    @Test
    public void myFirstTest() {
        assertThat(42).isEqualTo(42);
    }
}