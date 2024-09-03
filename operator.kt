fun main(){ 
    var xx= 5;
    println(xx.shr(2))//right shift operator
    println(xx.shl(2))//left shift operator
    var x : Boolean = true;
    var y : Boolean  = false;
    var resultxy : Boolean  = x.and(y);
    println(resultxy);
    println(++xx);
    println(--xx);
    println(-xx);

    var str : String? = null;
    var str2 : String? = "May be declare a nullable string"; //lvish operator
    var len1 : Int = str ?.length ?: -1
    var len2 : Int = str2 ?.length ?: -1
    println("Length of str is ${len1}");
    println("Length of str is ${len2}");

    //when in kotin
    var choice = 2;
    var result : String = when(choice){ //when returns a value that need to be stored in a variable  inorder to print it;
        1 ->"Hello"
        2 ->"Heyyy"
        3 ->"Hemlo"
        else  -> "No choice met"
    }
    println(result);

    //loops in kotlin 
    println("according to for loop by giving range");
    for (i in 1..5 ){
        print(i);
    }
    
    println("according to the for loop by using until");
    for (i in 1 until 5){
        print(i);
    }

    println("according to the for loop by using downTo step");
    for(i in 5 downTo 1 step 2){ 
        print(i);
    }
    
    //while loop
    var j=5;
    while(j<=5){ 
        println(j);
        j++;
    }
}