//without parameter
fun sum():Int { 
    var a = readLine()?.toInt() ?: 0
    var b = readLine()?.toInt() ?: 0
    val c= a+b;
    return c;
}

//withparameter
fun multiply(a:Int,b:Int):Int { 
    
    var c= a*b;
    return c;
}

//recursion function
var c=0;
fun rec(){
    c++;
    if(c<5){
        println("Value of counter is ${c}");
        rec();
    }
}

fun main(){
    val result = sum();
    println(result);
    var a = readLine()?.toInt() ?: 0
    var b = readLine()?.toInt() ?: 0
    val result2 =multiply(a,b);
    println(result2);
    rec();

}
//do the classes