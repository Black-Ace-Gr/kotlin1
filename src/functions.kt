//Functions are reusable blocks of code that perform a specific task


//simple function / named function
fun greet (){
    println("Hello from the named function")
}


//function made parameters
fun greet_with_parameters(name: String){
    println("Hello from params function : $name")
}

//Function with a 'return' value
fun add (a:Int, b:Int) : Int{
    return a + b
}

fun main(){
    greet() //invoking a function
    greet_with_parameters("Gregory")
    greet_with_parameters("Otieno")
    val sum = add(65, 75)
    println(sum)
}