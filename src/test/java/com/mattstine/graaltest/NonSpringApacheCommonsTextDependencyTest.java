package com.mattstine.graaltest;

import org.apache.commons.text.CaseUtils;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NonSpringApacheCommonsTextDependencyTest {

    @Test
    public void myTest() {
        assertThat(CaseUtils.toCamelCase("my name is jonas", true, ' '))
                .isEqualTo("MyNameIsJonas");
    }
}
