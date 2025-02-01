fun main() {
    println(checkGenre(Genre.RAP))// Genre rap supporté
    println(checkGenre(Genre.TECHNO)) // Genre techno supporté
    println(checkGenre(Genre.ROCK)) // Genre rock non supporté
}

/**
 * Vérifie si les genres "rap" et "techno" sont supportés
 * @param genre le genre à vérifier
 */
fun checkGenre(genre: String): String {
    return if (genre == "rap" || genre == "techno") {
        "Genre $genre supporté"
    } else {
        "Genre $genre non supporté"
    }
}

// BONUS
enum class Genre {
    RAP,
    TECHNO,
    ROCK
}

fun checkGenre(genre: Genre): String {
    return if (genre == Genre.RAP || genre == Genre.TECHNO) {
        "Genre $genre supporté"
    } else {
        "Genre $genre non supporté"
    }
}

