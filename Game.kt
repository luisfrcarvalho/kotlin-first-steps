fun main(args: Array<String>) {
    val choices = arrayOf("rock", "paper", "scissors").map { s -> s.lowercase() }.toTypedArray()
    val computerChoice = getRandomGameChoice(choices)
    val userChoice = getUserChoice(choices)
    println(winner(userChoice, computerChoice))
}

fun getRandomGameChoice(choices: Array<String>)= choices[(Math.random()*choices.size).toInt()]

fun getUserChoice(choices: Array<String>): String {
    var userInput: String = ""
    while(!isAValidChoice(choices, userInput.toString())){
        print("Please enter one of the following:")
        for(item in choices) print(" $item")
        println(".")
        userInput = readLine().toString()
    }
    return userInput.toString()
}

fun isAValidChoice(choices: Array<String>, choice: String): Boolean {
    if(choice.isNullOrEmpty())
        return false
    return choice.lowercase() in choices
}

fun winner(userChoice: String, computerChoice: String): String {
    val result: String = if(userChoice == computerChoice) {
        "Tie!"
    } else if(
        (userChoice == "scissors" && computerChoice == "paper") ||
        (userChoice == "rock" && computerChoice == "scissors") ||
        (userChoice == "paper" && computerChoice == "rock")) {
        "You win!"
    } else {
        "You loose!"
    }
    return "You chose $userChoice. I chose $computerChoice. $result"
}