package decorator.textreader

class Scrambling(var worker: Worker) : Decorator() {
    public override fun write(s: Array<String>) {
        val ss = arrayOf(String())
        worker.write(ss)
        println("encrypt:\t\t")
        s[0] = s[0].encrypt(ss[0])
    }

    public override fun read(s: Array<String>) {
        println("decrypt:\t\t")
        s[0] = s[0].decrypt(s[1])
        worker.read(s)
    }
}