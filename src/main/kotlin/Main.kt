fun main(args: Array<String>) {
    // Opsi 1:
    // val rows: Int = 5

    // Opsi 2:
    // print("Masukkan Baris Banyak Bintang: ")
    // val input: Int = readln().toInt()

    // Opsi 3:
    // Membuat objek Segitiga Sama Sisi
    val patternSegitigaSamaSisi = SegitigaSamaSisi()
    val patternSegitigaSamaSisiTerbalik = SegitigaSamaSisiTerbalik()
    val patternSegitigaBelahKetupat = SegitigaBelahKetupat()
    val patternSegitigaSikuSiku = SegitigaSikuSiku()
    val xPattern = XPattern()
    val plusPattern = PlusPattern()




    // Pemanggilan
    patternSegitigaSamaSisi.drawPattern(8)
    println()
    patternSegitigaSamaSisiTerbalik.drawPattern(8)
    println()
    patternSegitigaBelahKetupat.drawPattern(8)
    println()
    patternSegitigaSikuSiku.drawPattern(8)
    println()
    xPattern.drawPattern(9)
    println()
    plusPattern.drawPattern(9)
}