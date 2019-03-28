package decorator.textreader

import java.io.BufferedReader
import java.io.InputStreamReader

interface TextReader {
    val `in`: BufferedReader
        get() = BufferedReader(InputStreamReader(System.`in`))

    fun write(s: Array<String>) {}
    fun read(s: Array<String>) {}
}
