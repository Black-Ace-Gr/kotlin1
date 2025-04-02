//A loop allows us to repeat tasks a number of set times or over a collection of data
// in kotlin for loop(used when we have no of iterations) ,
// while loop( continues as log as a condition is true)
// foreach loop(used to loop over a collection e.g. arrays)
fun main(){
    //for loop
    //iterate over a range
    for (i in 1 .. 5){
        println(i)
    }
    //adding a step
    for (i in 1 .. 10 step 2){
        println(i)
    }
    // iterate down
    for (i in 5 downTo 1){
        println(i)
    }
    // iterate over a collection
    val fruits = listOf("apple","banana", "grapes")
    for (i in fruits){
        converttoUpper(i)
        println(i)
    }
    // print with index positions
    for ((index,fruit) in fruits.withIndex()){
        println("$index :: $fruit")
    }
    var i = 1
    //basic while loop
    while(i <= 5){
        println(i)
        i++
    }
    //do while loop :: do executes without condition then utilizes the while block to look at the condition
    var j = 1
    do {
        println(j)
        j++
    } while (j <= 5)

    //NESTED LOOP ::A loop inside a loop
    //For every iteration of the outer loop, the inner loop must complete its set of iteration

    for(i in 1 .. 3){
        println("$i : OUTER LOOP")
        for (j in 1 .. 3){ //inner loop
            println("$j : inner loop")

        }
    }

    //CONTROL STATEMENTS : break, continue, labels(outer and inner)
    // break :: terminates the loop when the condition is met
    for (i in 1 .. 10) {
        if (i == 5 ){
            break
        }
        println(i)
    }
    //continue :: if the condition is met it skips the iteration
    for (i in 1 .. 10) {
        if (i == 5 ){
            continue
        }
        println(i)
    }
    //label statements outer and inner
    outer@ for (i in 1 .. 3){
        inner@ for (j in 1 .. 4){
            if (i == 2 && j == 2){
                break@outer
            }
            println("i = $i  j = $j")
        }
    }
    //forEach :: iterate/ loop over collections
    val numbers = listOf(1,2,3,4,5,6,7)
    val names = listOf("Gregory", "Ochieng", "Otieno")
    numbers.forEach{
        println("$it")
    }
    names.forEach{
        converttoUpper(it)
    }
}

fun converttoUpper(i : String){
    println(i.uppercase())
}