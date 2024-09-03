fun main(){ 
    println("Enter the two numbers :");
    var a = readLine()?.toInt() ?: 0
    var b = readLine()?.toInt() ?: 0
    println("Enter any operator [+,-,*,/,%,]");
    var c = readLine();
    var result : Int;
    when(c){ 
        "+" -> {
            result=a+b;
            println(result);
        }
    
         "-" -> {
        result=a-b;
        println(result);
        }
        "*" -> {    
            result=a*b;
            println(result);
         }
         "/" -> {
            if(b!=0){
            result=a/b;
            println(result);
            }
            else{ 
                println("Number cannot be divided by 0");
            }
        }   
        "%" -> {
            result=a%b;
            println(result);
       }

}
}