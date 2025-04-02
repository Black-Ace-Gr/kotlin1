// "content" :: strings to store text
// strings contain a collection of characters surrounded by double quotes

var text = "Hello World"
//string concatenation
var firstname = "Gregory"
var lastname = "Otieno"
fun main(){
    //accessing a character in a string
    println(text[4])
    //getting the length of a string
    println(text.length)
    println(text.uppercase())
    println(text.lowercase())
    //*
    val fullname = "My name is " + firstname +  " " +lastname
    println(fullname)
    println("My name is $firstname $lastname")
}