package decorator.textreader

import java.io.BufferedReader
import java.io.InputStreamReader

abstract class TextReader {
    protected var `in` = BufferedReader(InputStreamReader(System.`in`))
    protected open fun write(s: Array<String>) {}
    protected open fun read(s: Array<String>) {}
}
