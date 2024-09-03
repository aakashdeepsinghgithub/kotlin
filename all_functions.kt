fun main() {
    // 1. Creating Arrays
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val intNumbers = intArrayOf(5, 3, 8, 1, 9)

    // 2. Accessing Elements
    println("First element: ${numbers.first()}")
    println("Last element: ${numbers.last()}")
    println("Index of element 3: ${numbers.indexOf(3)}")

    // 3. Modifying Arrays
    numbers.set(0, 10) // Set the first element to 10
    println("Modified array: ${numbers.joinToString(", ")}")

    val filledArray = numbers.copyOf() // Copy array to preserve original
    filledArray.fill(0) // Fill the array with 0
    println("Filled array: ${filledArray.joinToString(", ")}")

    val newNumbers = numbers.plus(6) // Add element 6 to the array
    println("New array with added element: ${newNumbers.joinToString(", ")}")

    // 4. Array Size
    println("Size of the array: ${numbers.size}")
    println("Is the array empty? ${numbers.isEmpty()}")

    // 5. Sorting and Reversing
    intNumbers.sort() // Sort in ascending order
    println("Sorted int array: ${intNumbers.joinToString(", ")}")

    val reversed = intNumbers.reversedArray() // Reverse the array
    println("Reversed array: ${reversed.joinToString(", ")}")

    // 6. Filtering and Mapping
    val evenNumbers = intNumbers.filter { it % 2 == 0 } // Filter even numbers
    println("Even numbers: ${evenNumbers.joinToString(", ")}")

    val doubled = intNumbers.map { it * 2 } // Map to double each element
    println("Doubled values: ${doubled.joinToString(", ")}")

    // 7. Aggregation
    println("Sum of array elements: ${intNumbers.sum()}")
    println("Average of array elements: ${intNumbers.average()}")
    println("Minimum value: ${intNumbers.minOrNull()}")
    println("Maximum value: ${intNumbers.maxOrNull()}")

    // 8. Array Transformation
    val list = intNumbers.toList() // Convert array to list
    println("Converted to list: $list")

    val typedArray = intNumbers.toTypedArray() // Convert to typed array
    println("Converted to typed array: ${typedArray.joinToString(", ")}")

    // 9. Other Utility Functions
    println("Does the array contain 3? ${intNumbers.contains(3)}")

    val subArray = intNumbers.slice(1..3) // Slice array from index 1 to 3
    println("Sliced array: ${subArray.joinToString(", ")}")

    val distinctNumbers = arrayOf(1, 2, 2, 3, 3, 4).distinct() // Distinct elements
    println("Distinct numbers: ${distinctNumbers.joinToString(", ")}")
}
