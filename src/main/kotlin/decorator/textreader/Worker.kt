package decorator.textreader

import java.io.IOException

class Worker : TextReader() {
    public override fun write(s: Array<String>) {
        print("Input:\t\t")
        try {
            s[0] = `in`.readLine()
        } catch (ex: IOException) {
            ex.printStackTrace()
        }

    }

    public override fun read(s: Array<String>) {
        println("Output:\t\t" + s[0])
    }
}
