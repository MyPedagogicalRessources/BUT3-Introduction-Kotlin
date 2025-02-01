package exos

import org.junit.jupiter.api.Assertions.*
import java.util.*
import kotlin.test.Test

class ConcertTest {

    @Test
    fun testDescriptionAvecPrix() {
        val concert = Concert("Mandragora", Date(), "Le Bikini", 10)
        assertEquals("Le concert de Mandragora aura lieu le ${Date()} à Le Bikini, et le prix du ticket est de 10€.", concert.description())
    }

    @Test
    fun testDescriptionSansPrix() {
        val concert = Concert("Mairo", Date(), "Zenith Toulouse")
        assertEquals("Le concert de Mairo aura lieu le ${Date()} à Zenith Toulouse, Prix non défini.", concert.description())
    }

}