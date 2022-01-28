fun main(args: Array<String>){
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoise(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>): String =
    optionsParam[(Math.random()*optionsParam.size).toInt()]

fun getUserChoise(optionsParam: Array<String>): String {
var isValidChoice = false
    var userChoice = ""
    while(!isValidChoice){
        print("Please enter one of following:")
        for(item in optionsParam) print(" $item")
        println(".")
        val userInput = readLine()
        if(userInput != null && userInput in optionsParam){
            isValidChoice = true
            userChoice = userInput
        }
        if(!isValidChoice)print("U must enter a valid choice")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
val result: String
if (userChoice == gameChoice)result = "Tie!"
    else if((userChoice == "Rock" && gameChoice == "Scissors")||
    (userChoice == "Paper" && gameChoice == "Rock")||
    (userChoice == "Scissors" && gameChoice == "Paper"))result = "U win!"
    else result = "U lose!"
    println("U chose $userChoice. I chose $gameChoice. $result")
}
