fun bill(coffeeId:Int , coffeeType:Int){
    when(coffeeId){
        1 -> {
            when(coffeeType){
                
            }
        }

        2-> {
            when(coffeeType){

            }
        }
    }
}

fun hotCoffeeMenu(){
    println("PLease Select one of the Hot coffee from below..")
    println("1)Latte")
    println("2)Espresso")
    println("3)Cappucino")
    var coffeeType=readLine()!!.toInt()
    bill(1,coffeeType)

}
fun coldCoffeeMenu(){
    println("PLease Select one of the Cold coffee from below..")
    println("1)Cold Brew")
    println("2)Cold Rush")
    println("3)Cold Vanilla Coffee")
    var coffeeType=readLine()!!.toInt()
    bill(2,coffeeType)
}
fun main(){
    var coffeeChoice:Int=0
    while(coffeeChoice!=3){
        println("Hello , Welcome to the coffee machine ....May i know your name ? ")
        val userName=readLine()!!
        println("What would you like to have today $userName ? ")
        println("1)Hot coffee ")
        println("2)Cold coffee ")
        println("3)Exit ")
        coffeeChoice=readLine()!!.toInt()


        when(coffeeChoice){
            1 -> hotCoffeeMenu()
            2 -> coldCoffeeMenu()
        }

    }

}
