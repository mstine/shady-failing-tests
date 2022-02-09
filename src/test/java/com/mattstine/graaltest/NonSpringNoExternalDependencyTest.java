package com.mattstine.graaltest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NonSpringNoExternalDependencyTest {

    @Test
    public void myTest() {
        assertThat(new DummyClass().hello()).isEqualTo("Hello, World!");
    }


}
