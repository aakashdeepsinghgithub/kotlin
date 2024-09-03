class Person{ 
    var name :String;
    var age:Int;
    constructor(x:String,y:Int){
        this.name=x;
        this.age=y;
    }
    constructor(){
        this.name="Aakash Deep Singh";
        this.age=21;
    }
    fun intro(){ 
        println("My name is ${name}");
        println("My age is ${age}");
    }
}
fun main(){ 
    var a =Person("Aakash",22);
    a.intro();
    var b=Person();
    b.intro();
}