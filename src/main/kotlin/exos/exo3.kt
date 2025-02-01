package exos

import java.util.Date

class Concert(
    private val nomArtiste: String,
    private val date: Date,
    private val salle: String
) {
    fun description(): String {
        return "Le concert de $nomArtiste aura lieu le $date à la salle $salle"
    }
}