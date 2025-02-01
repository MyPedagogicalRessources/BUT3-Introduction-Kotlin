package exos

fun exo21() {
    val rappeurs = mutableListOf("Houdi", "Luther", "Laylow")
    rappeurs.add("La Fève")
    rappeurs.add("Khali")

    for (rappeur in rappeurs) {
        println(rappeur)
    }
}