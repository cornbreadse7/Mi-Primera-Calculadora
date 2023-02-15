package com.ejemplo.calculadora.Contrtoller

import com.ejemplo.calculadora.Model.valModel

class FuncionesController {



    fun Todal (num1: Int, num2: Int)
    {
        var sum =valModel(num1, num2);

        println(sum.numero01);
        println(sum.numero02);

        sum.resultado = num1+num2;
        println("la suma es:" + sum.resultado);
    }





    fun resta (num1: Int, num2: Int)
    {
        var sum = valModel(num1, num2);
        println(sum.numero01);
        println(sum.numero02);
        sum.resultado = num1-num2;
        println("la resta es:" + sum.resultado);
        //val result:Int= num1 - num2;

    }

    fun multiplicacion (num1: Int, num2: Int)
    {
        var sum = valModel(num1, num2);
        println(sum.numero01);
        println(sum.numero02);
        sum.resultado = num1-num2;
        println("la resta es:" + sum.resultado);
        //val result:Int= num1 - num2;

    }

    fun division (num1: Int, num2: Int)
    {
        var sum = valModel(num1, num2);
        println(sum.numero01);
        println(sum.numero02);
        sum.resultado = num1-num2;
        println("la resta es:" + sum.resultado);
        //val result:Int= num1 - num2;

    }


}