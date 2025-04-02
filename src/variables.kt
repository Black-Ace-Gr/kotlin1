//variables are containers for storing data
//to create variables in kotlin we use the following:
//var :: the values stored can be changed
//val :: the values stored by the variable can not be changed


var name = "Gregory"
val occupation = "software developer" //string
val myNum = 5 //integer
val doubleNum = 5.00 //double (decimal notations)
val myLetter = 'G' // character
val iskotlinfun = true //boolean => true or false
val cars = arrayOf("vovlvo", "Mercedes", "BMW", "Audi", true) //array elements are
// accessed using  the index position


//to output in kotlin create the function main
fun main(){
    name = "David"
    println(name)
    println(occupation)
    println(cars[2])
}