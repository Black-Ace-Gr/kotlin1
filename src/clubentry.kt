// using if
fun main(){
    println("Welcome to the club entry system")
    print("Enter your age: ")
    val age = readLine()!!.toInt()
    if (age < 18){
        println("access denied, you must be at least 18")
    }

    else{
        println("Access granted")
    }
    print("Do you have a VIP pass(yes/no) :")
    val hasVIPPass = readLine()!!
    if (hasVIPPass.lowercase() == "yes"){
        println("VIP access granted")
    }
    else {
        println("VIP access denied, proceed to membership number")
        print("Enter membership number")
        val memNum = readLine()!!
        println("Welcome to the club member number $memNum")
    }


}