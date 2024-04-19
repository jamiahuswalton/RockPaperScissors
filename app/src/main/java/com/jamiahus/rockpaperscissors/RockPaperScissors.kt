package com.jamiahus.rockpaperscissors

fun main () {
    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper, or Scissors? Enter your choice!")
    playerChoice = readln()

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }

    println(computerChoice)

    var userInputerCheck = true
    while (userInputerCheck){
        if (playerChoice == "Rock"){
            userInputerCheck = false
            break
        } else if (playerChoice == "Paper"){
            userInputerCheck = false
            break
        } else if (playerChoice == "Scissors"){
            userInputerCheck = false
            break
        }

        println("Choice is invalid. Please enter Rock, Paper, or Scissors.")
        playerChoice = readln()
    }

    val winner = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }

    if (winner == "Tie"){
        println("It is a tie.")
    } else {
        println("$winner won!")
    }
}