package ndk.banee.kotlin_multi_platform_sample

expect val platform: String

class Greeting {
    fun greeting() = "Hello, $platform!"
}