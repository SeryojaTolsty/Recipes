fun main(args: Array<String>) {
    var x = 1
    println("Before the loop x = $x")
    while (x < 4) {
        println("In the loop x = $x")
        x = x + 1
    }
    println("After the loop x = $x")

    println("")

    val a = 2
    val b = 4
    println(if (a > b) "a greater than b" else "a isn't greater than b")
    println("This lines runs no matter what")

    println("")

    var z = 1
    while (z < 3) {
        print(if (z == 1) "Yab" else "Dab")
        print("ba")
        z = z + 1
    }
    if (z == 3) println("Do")
}

