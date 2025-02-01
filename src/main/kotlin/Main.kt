import exos.Concert
import exos.exo21
import exos.exo22
import java.util.*

fun main() {
    // exo21()
    // exo22()

    val concert1 = Concert("H JeuneCrack", Date(), "Le Bikini", 10)
    val concert2 = Concert("Mairo", Date(), "Zenith Toulouse")

    println(concert1.description())
    println(concert2.description())

}
