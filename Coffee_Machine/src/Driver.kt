class Bill(
    var latteAmount: Int = 127,
    var espressoAmount: Int = 38,
    var cappucinoAmount: Int = 114,
    var coldBrewAmount: Int = 226,
    var coldRushAmount: Int = 241,
    var coldVanillaCoffeeAmount: Int = 98

){
    fun calculateAmount(coffeeId:Int,type:Int):Int{
        if(coffeeId==1){
            if(type==1){
                return latteAmount
            }
            else if(type==2){
                return espressoAmount
            }
            else if(type==3){
                return cappucinoAmount
            }
        }
        else if(coffeeId==2){
            if(type==1){
                return coldBrewAmount
            }
            else if(type==2){
                return coldRushAmount
            }
            else if(type==3){
                return coldVanillaCoffeeAmount
            }
        }
        return -1
    }

}

fun bill(coffeeId:Int , coffeeType:Int){
    val obj=Bill()
    println("Your bill total is : ${obj.calculateAmount(coffeeId,coffeeType)}")
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
