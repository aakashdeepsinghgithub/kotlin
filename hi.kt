// fun main(){
//     println("Hello Kotlin bacha....! ")  
//     var a : Int = 2 //give either the type or or provide some initial value 
//     var b = 3
//     val _c = 0
//     // c=a+b  will show 'val' cannot be reassigned as the typr of c is val(Not mutable)
//     // println(c)
//     println("the answer is "+(a+b))
//     println(a>b)
//     // var s : string ="Kotli"
//     // println(s)
//     var age : Int = 25
//     println(age)
// 
// fun greet ()
// {
//     val message : String = "Hello kotlin"
//     println(message)
// }}

// class Person 
// {
//     var name : String = "Joe"
//     val age : Int = 30
//     val mutation = 1.2
//     fun displayinfo(){ 
//         println("Name: $name, Age : $age") //in place of $ the + will not work 
//         println("The age after mutatin in the DNA of $name is ${age*mutation}")
//     }
// }
// fun main(){ 
//     val person = Person()
//     person.displayinfo()

// }
fun main(){ 
    val a : Char = 'a';
    val s : String = """This is                 
                        the exact paragraph""" /// print the string as it is
    println(a);
    println('\n'); //prints a newline
    println('\$');
    println(s); 
    val A : Boolean = true;
    println(A);
    val numbers = arrayOf(1,2,3,4) ;
    println(numbers[0]);
    println(numbers[1]);
    println(numbers[2]);
    println(numbers[3]);
    val words : Array<String> = arrayOf("Kotlin","java","Python");
    println(words[0]);
    println(words[1]); // accesing the element of array by using [] .
    println(words[2]);
    val size = numbers.size;
    println("The size of the array numbers is: "+size);
    println("The array numbers is empty: "+numbers.isEmpty());
    // val square = Array(5) ( in-> i*i)
    //2d array       
    
 }
 