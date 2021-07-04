package com.hjx.apiSpringKt

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleTest {
    @Test
    fun `this is a canary test`() {
        assertThat(Example().canary()).isEqualTo("I am a canary!")
    }
}
