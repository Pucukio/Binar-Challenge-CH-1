/**
 * 1. Menerapkan bahasa pemrograman Kotlin (30 poin)
 * 2. Menerapkan control flow (20 poin)
 * 3. Menerapkan function & method untuk masing-masing task (20 poin)
 * 4. Menerapkan setidaknya 1 ciri SOLID principle (10 poin)
 * 5. Menerapkan setidaknya 2 konsep OOP dalam membuat bentuk (20 poin)
 * */

// OOP: Interface untuk bentuk macam Pola
interface Pattern {
    fun drawPattern(rows: Int)
}

// Kelas untuk Pola Bintang Segitiga Sama Sisi
// Single Responsibility
// OOP: Override
// Control Flow
class SegitigaSamaSisi : Pattern {
    override fun drawPattern(rows: Int) {
        for (i in 1..rows) {
            for (j in 1..rows-i) {
                print(" ")
            }
            for (k in 1..i*2-1) {
                print("*")
            }
            println()
        }
    }
}

// Kelas untuk Pola Bintang Segitiga Sama Sisi Terbalik
// Single Responsibility
// OOP: Override
// Control Flow
class SegitigaSamaSisiTerbalik : Pattern {
    override fun drawPattern(rows: Int) {
        for (i in rows - 1 downTo 1) {
            for (j in rows - i downTo 1) {
                print(" ")
            }
            for (k in 1..(2 * i - 1)) {
                print("*")
            }
            println()
        }
    }
}

// Kelas untuk Pola Bintang Segitiga Belah Ketupat
// Single Responsibility
// OOP: Override
// Control Flow
class SegitigaBelahKetupat : Pattern {
    override fun drawPattern(rows: Int) {
        for (i in 1..rows) {
            for (j in 1..rows-i) {
                print(" ")
            }
            for (k in 1..i*2-1) {
                print("*")
            }
            println()
        }
        for (i in rows - 1 downTo 1) {
            for (j in rows - i downTo 1) {
                print(" ")
            }
            for (k in 1..(2 * i - 1)) {
                print("*")
            }
            println()
        }
    }
}

// Kelas Pola Bintang Segitiga Siku-Siku
// Single Responsibility
// OOP: Override
// Control Flow
class SegitigaSikuSiku : Pattern {
    override fun drawPattern(rows: Int) {
        for (i in 1..rows) {
            for (j in 1..i) {
                print("* ")
            }
            println()
        }
    }
}

// Kelas untuk Pola X
// Single Responsibility
// OOP: Override
// Control Flow
class XPattern : Pattern {
    override fun drawPattern(rows: Int) {
        for (i in 0 until rows) {
            for (j in 0 until rows) {
                if (i == j || i + j == rows - 1) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}

// Kelas untuk Pola Plus
// Single Responsibility
// OOP: Override
// Control Flow
class PlusPattern: Pattern {
    override fun drawPattern(rows: Int) {
        for (i in 0 until rows) {
            for (j in 0 until rows) {
                if (i == rows / 2 || j == rows / 2) {
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
    }
}
