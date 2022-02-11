fun main(args: Array<String>) {
    val bugSs: String = readLine() ?: return
    val bugk: Int = calcChairs(bugSs.toInt())
    println("$bugk стульев")


//    val moneyVl: Int = calcBugMoneyValue(dayNmb.toInt(), bugRnk.toInt(), cashAmt.toInt())
//    println("$moneyVl сахара")
}
fun calcChairs(bugs: Int): Int {
    var chairs = bugs + bugs / 2
    return 105
}

fun calcBugMoneyValue (day: Int, rank: Int, cash: Int): Int {

    print("День недели: ")
    val dayNumber: String? = readLine()
    print("Ранг жука: ")
    val bugRank: String? = readLine()
    print("Количество денег: ")
    val cashAmount: String? = readLine()
// подсказка
// (день * ранг + 42) * кол-во денежных единиц
    var sugar = (dayNumber * bugRank + 42) * cashAmount
    return sugar
}