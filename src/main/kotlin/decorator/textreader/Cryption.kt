package decorator.textreader

/**
 * This class provides encryption and decryption ciphers
 */

internal fun String.encryptWithXOR(password: String): String {
    val key = password.toByteArray()
    var output = String()
    this.forEachIndexed { i, c ->
        val a = c.toInt()
        val b = key[i % key.size].toInt()
        output += ((a xor b).toChar())
    }
    return output
}

internal fun String.decryptWithXOR(password: String): String {
    return this.encryptWithXOR(password)
}

internal fun String.encryptWithAES(password: String): String = TODO()

internal fun String.decryptWithAES(password: String): String = TODO()