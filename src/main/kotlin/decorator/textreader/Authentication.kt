package decorator.textreader

import java.io.IOException

class Authentication(var scrambling: Scrambling) : Decorator() {
    public override fun write(s: Array<String>) {
        print("PASSWORD:\t")
        try {
            s[0] = `in`.readLine()
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
        scrambling.write(s)
    }

    public override fun read(s: Array<String>) {
        print("PASSWORD:\t")
        try {
            s[0] = `in`.readLine()
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
        scrambling.read(s)
    }
}
