import java.io.File


fun main() {
    val papka = File("Papka")
    papka.mkdir()

    for (i in 1..2){
        val papka1 =File("Papka/papka$i")
        papka1.mkdirs()
        for (j in 1..3){
            val papka3 = File("Pappa/papka$i/papka$j")
            papka3.mkdirs()
            for (f in 1..4){
                val file = File(papka3,"file$f.txt")
                file.createNewFile()
                file.writeText("azizbek madaminov")

            }
        }
    }

}