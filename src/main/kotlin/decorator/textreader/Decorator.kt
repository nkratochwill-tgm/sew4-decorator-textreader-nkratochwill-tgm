package decorator.textreader

open class Decorator : TextReader() {
    lateinit var textReader: TextReader
}
