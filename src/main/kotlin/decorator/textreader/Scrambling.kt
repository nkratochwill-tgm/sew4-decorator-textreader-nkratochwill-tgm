package decorator.textreader

import java.io.IOException

class Scrambling(var worker: Worker) : Decorator() {
    public override fun write(s: Array<String>) {
        worker.write(s)
        println("encrypt:\t\t")
        try {
            s[0] = "hallosew"
            TODO("implement encrypt algorithm")
        } catch (ex: IOException) {
            ex.printStackTrace()
        }
        worker.read(s)
    }

    public override fun read(s: Array<String>) {
        worker.write(s)
        println("decrypt:\t\t")
        try {
            s[0] = "hallo"
            TODO("implement decrypt algorithm")

        } catch (ex: IOException) {
            ex.printStackTrace()
        }
        worker.read(s)
    }
}
