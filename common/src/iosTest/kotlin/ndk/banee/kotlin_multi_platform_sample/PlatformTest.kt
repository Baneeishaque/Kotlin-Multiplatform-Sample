package ndk.banee.kotlin_multi_platform_sample

import kotlin.test.Test
import kotlin.test.assertTrue

class PlatformTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().greeting().contains("ios"), "Check ios is mentioned")
    }
}