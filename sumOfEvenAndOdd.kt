fun main() {
    println("Enter the element of array separated by spaces:")
    // input lega or directly usko int me convert karke array bana dega
    val array = readLine()!!.split(" ").map(String::toInt); // !! matlab ki array null nahu ho sakti
    var sEven = 0;                                          // .map convert each string in the list to an integer
    var sOdd = 0;
    for(element in array){ 
        if(element %2 == 0){ 
            sEven += element;
        }
        if(element %2 != 0){ 
            sOdd += element;
        }
    }
    println("The sum of odd numbers in the array is ${sOdd}");
    println("The sum of Even numbers in the array is ${sEven}");
}


