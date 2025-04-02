// using when
fun main(){
    println("Welcome to the club entry system")
    print("Enter your age: ")
    val age = readln().toInt()
    when {
    age >= 18 -> println("Access granted")
    age < 18 -> println("Access denied")
    }
    println("do you have a VIP pass?")
    val VIPpass = readln().lowercase()
    when (VIPpass) {
        "yes" -> println("VIP pass granted")
        "no" -> println("Proceed to membership number")
    }
    println("Enter membership number : ")
    val memNum = readln().toInt()
    print("Welcome, member $memNum")
}