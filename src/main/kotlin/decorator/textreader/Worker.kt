package decorator.textreader

import java.io.IOException

/**
 * Reads in the user text to encrypt or decrypt
 */
class Worker : TextReader {
    override fun write(s: Array<String>) {
        print("Input:\t\t")
        try {
            s[0] = `in`.readLine()
        } catch (ex: IOException) {
            ex.printStackTrace()
        }

    }

    override fun read(s: Array<String>) {
        println("Output:\t\t" + s[0])
    }
}
