package ndk.banee.kotlin_multi_platform_sample

import org.junit.Assert.assertTrue
import org.junit.Test

class PlatformTest {

    @Test
    fun testExample() {
        assertTrue("Check jvm is mentioned", Greeting().greeting().contains("jvm"))
    }
}