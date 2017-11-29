package com.example.confuste.kotlinexamples


import android.app.Activity
import android.os.Bundle
import android.util.Log

class MainActivity : Activity() {


    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        val kotlinObject = KotlinFunctions()
        val kotlinResult = kotlinObject.sumHigherOrder(3, 2, kotlinObject.sumAnonymousSingleLine)


        val javaObject = JavaClass()
        val resultJava = javaObject.sumHigherOrderSimulate(3, 7, kotlinObject.sumAnonymousSingleLine)

        Log.i("Alex", "result from Kotlin = $kotlinResult")
        Log.i("Alex", "result from Java = $resultJava")

    }

}
