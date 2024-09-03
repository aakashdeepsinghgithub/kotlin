fun main(){ 
    val amt : Int = 2000;
    val member : Boolean = true;
    if(amt>=1000){ 
        if(member == true){ 
            println("YOU A MEMBER AND ELIGIBLE FOR 20% DISCOUNT");
        }
            else{
                println("YOU A ELIGIBLE FOR 10% DISCOUNT");
            }
    }
    else { 
        println("NO DISCOUNT");
    }
}