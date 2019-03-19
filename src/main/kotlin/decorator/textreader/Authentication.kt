package decorator.textreader

import java.io.IOException

class Authentication(var scrambling: Scrambling) : Decorator() {
    public override fun write(s: Array<String>) {
        print("PASSWORD:\t")
        try {
            s[0] = `in`.readLine()
            scrambling.write(s)
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
    }

    public override fun read(s: Array<String>) {
        print("PASSWORD:\t")
        val ss = arrayOf(String(), String())
        try {
            ss[0] = s[0]
            ss[1] = `in`.readLine()
            scrambling.read(ss)
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
    }
}
