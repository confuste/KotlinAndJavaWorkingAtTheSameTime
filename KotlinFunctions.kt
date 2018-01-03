package com.example.confuste.kotlinexamples


/**
 * Created by Alejandro Fuster on 29/11/17.
 */
class KotlinFunctions {

    init{
        //Nothing to initialize
    }

    /**
     * Calculate a sum
     * @param a: Integer
     * @param b: Integer
     * @return Int number which is the final result
     */
    fun sumSingleLine (a:Int, b: Int) : Int = a+b

    /**
     * Calculate a sum
     * @param a: Integer
     * @param b: Integer
     * @return Int number which is the final result
     */
    fun sumSeveralLines(a:Int, b:Int): Int {
        return a+b
    }

    /**
     * Anonymous function without name. It must be assigned to a variable.
     * This function only support a single line.
     */
    val sumAnonymousSingleLine = { x: Int, y: Int -> x + y  }

    /**
     * Anonymous function without name. It must be assigned to a variable.
     * This function supports several lines.
     */
    val sumAnonymousSeveralLines = fun(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * Calculate an operation between 2 numbers
     * @param a: Integer
     * @param b: Integer
     * @param c: Function which require 2 Int and return 1 Int.
     * @return Int
     */
    fun sumHigherOrder(a: Int, b: Int, c: (Int, Int) -> Int ) : Int{
        return c(a, b)
    }

    fun exampleUseOfsumHigherOrder() {

        sumHigherOrder(3, 2, sumAnonymousSingleLine)
        sumHigherOrder(3, 2, sumAnonymousSeveralLines)
    }

}
