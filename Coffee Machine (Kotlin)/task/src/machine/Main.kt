package machine
var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550

fun printStatus() {
    println("\nThe coffee machine has:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$beans g of coffee beans")
    println("$cups disposable cups")
    println("$$money of money")
}

fun main() {
    var exit = false
    // start
    do {
        println()
        println("Write action (buy, fill, take, remaining, exit): ")
        val action = readln()

        when (action) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                val type = readln()
                when (type) {
                    "1" -> {
                        if (water - 250 >= 0 && beans - 16 >= 0 && cups > 0) {
                            println("I have enough resources, making you a coffee!")
                            water -= 250
                            beans -= 16
                            cups -= 1
                            money += 4
                        } else {
                            println("Sorry, not enough water!")
                        }
                    }
                    "2" -> {
                        if (water - 350 > 0 && milk >= 75 && beans - 20 > 0 && cups > 0) {
                            println("I have enough resources, making you a coffee!")
                            water -= 350
                            milk -= 75
                            beans -= 20
                            cups -= 1
                            money += 7
                        } else {
                            println("Sorry, not enough water!")
                        }
                    }
                    "3" -> {
                        if (water - 200 > 0 && milk >= 100 && beans - 12 > 0 && cups > 0) {
                            println("I have enough resources, making you a coffee!")
                            water -= 200
                            milk -= 100
                            beans -= 12
                            cups -= 1
                            money += 6
                        } else {
                            println("Sorry, not enough water!")

                        }
                    }
                    "back" -> {

                    }
                }
            }
            "fill" -> {
                println("Write how many ml of water you want to add: ")
                water += readln().toInt()
                println("Write how many ml of milk you want to add: ")
                milk += readln().toInt()
                println("Write how many grams of coffee beans you want to add: ")
                beans += readln().toInt()
                println("Write how many disposable cups you want to add: ")
                cups += readln().toInt()
            }
            "take" -> {
                println("I gave you $$money")
                money = 0
            }
            "remaining" -> {
                printStatus()
            }
            "exit" -> {
                exit = true
            }
        }
    } while (!exit)
}