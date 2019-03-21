package decorator.textreader

/**
 * Encrypts and decrypts user input
 */
class Scrambling(var worker: Worker) : Decorator() {
    public override fun write(s: Array<String>) {
        val ss = arrayOf(String())
        worker.write(ss)
        println("encrypt:\t\t")
        s[0] = ss[0].encryptWithXOR(s[0])
    }

    public override fun read(s: Array<String>) {
        println("decrypt:\t\t")
        s[0] = s[0].decryptWithXOR(s[1])
        worker.read(s)
    }
}