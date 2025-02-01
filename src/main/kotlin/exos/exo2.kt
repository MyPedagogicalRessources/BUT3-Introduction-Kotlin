package exos

fun exo21() {
    val rappeurs = mutableListOf("Houdi", "Luther", "Laylow")
    rappeurs.add("La Fève")
    rappeurs.add("Khali")

    for (rappeur in rappeurs) {
        println(rappeur)
    }
}

fun exo22() {
    val salles = mutableMapOf(
        "Le Bikini" to 1500,
        "Zenith Toulouse" to 11000,
        "Le Rex" to 800
    )
    salles["Nouvelle salle"] = 5000

    for ((salle, capacite) in salles) { // Destructuring
        println("$salle - $capacite")
    }
}