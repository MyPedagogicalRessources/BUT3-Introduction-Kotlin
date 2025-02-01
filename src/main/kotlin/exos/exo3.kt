package exos

import java.util.Date

class Concert(
    private val nomArtiste: String,
    private val date: Date,
    private val salle: String,
    private val prixTicket: Int? = null
) {
    fun description(): String {
        val prixInfo = prixTicket?.let { "et le prix du ticket est de $it€" } ?: "Prix non défini"
        return "Le concert de $nomArtiste aura lieu le $date à $salle, $prixInfo."
    }
}