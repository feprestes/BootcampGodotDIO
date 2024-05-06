package org.example

fun main() {
    val name = "Ninja Guerreiro Milenar"
    val xp = 9999

    val level = when(xp) {
        in 0..1000 -> "Ferro"
        in 1001..2000 -> "Bronze"
        in 2001..5000 -> "Prata"
        in 5001..7000 -> "Ouro"
        in 7001..8000 -> "Platina"
        in 8001..9000 -> "Ascendente"
        in 9001..10000 -> "Imortal"
        in 10001..Int.MAX_VALUE -> "Radiante"
        else -> "Nao Classificado"
    }

    println("O heroi de nome ${name} esta no nivel ${level}")
}