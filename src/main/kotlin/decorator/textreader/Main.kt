package decorator.textreader

fun main() {
    println("main:\t\tlet's start!")
    val stream = Authentication(Scrambling(Worker()))
    val str = arrayOf(String())
    stream.write(str)
    println("main:\t\t" + str[0])
    stream.read(str)
}

