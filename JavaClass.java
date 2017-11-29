package com.example.confuste.kotlinexamples;


import kotlin.jvm.functions.Function2;

/**
 * Created by Alejandro Fuster on 29/11/17.
 */

public class JavaClass {

  public JavaClass(){

  }

  /**
   * This function is a wrapper of kotlin. It allow to pass like argument a couple of integers and
   * an anonymous function writes on kotlin.
   * @param a Integer
   * @param b Integer
   * @param c Anonymous function of Kotlin which require 2 Integers and return 1 Integer
   * @return The int result
   */
  public int sumHigherOrderSimulate(int a, int b, Function2<Integer, Integer, Integer> c) {

    KotlinFunctions kotlinFunctions = new KotlinFunctions();
    return kotlinFunctions.sumHigherOrder(a,b,c);
  }
}
