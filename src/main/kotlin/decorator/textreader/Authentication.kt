package decorator.textreader

import java.io.IOException

/**
 * Reads in the user password that will be used to encrypt or decrypt the user text from Worker.kt
 */
class Authentication(var scrambling: Scrambling) : Decorator() {
    override fun write(s: Array<String>) {
        print("PASSWORD:\t")
        try {
            s[0] = `in`.readLine()
            scrambling.write(s)
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
    }

    override fun read(s: Array<String>) {
        print("PASSWORD:\t")
        val ss = Array(2) { "" }
        try {
            ss[0] = s[0]
            ss[1] = `in`.readLine()
            scrambling.read(ss)
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
    }
}
