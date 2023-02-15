package com.ejemplo.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ejemplo.calculadora.Contrtoller.FuncionesController
import com.ejemplo.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonsuma.setOnClickListener {
            val numero1: Int = binding.numero1.text.toString().toInt()
            val numero2: Int = binding.numero2.text.toString().toInt()


            val resultado = suma(numero1, numero2);
            val func = FuncionesController();

            func.Todal(numero1, numero2);

            //val resultado = func.resta(numero1, numero2);

            //val resultado = func.multiplicacion(numero1, numero2);

                //val resultado = func.divi(numero1, numero2);
        //val result: Int = numero1 + numero2

            //binding.resultado.text = suma.resultado.toString()
            binding.resultado.text = resultado.toString()
            //Toast.makeText(this," tu valor es {$result}",Toast.LENGTH_SHORT).show()


        }

        binding.buttonresta.setOnClickListener{
            val numero1: Int = binding.numero1.text.toString().toInt()
            val numero2: Int = binding.numero2.text.toString().toInt()
            val resultado = resta(numero1, numero2);
            val func = FuncionesController();
            func.resta(numero1, numero2);
            binding.resultado.text = resultado.toString()

        }

        binding.buttonproducto.setOnClickListener{
            val numero1: Int = binding.numero1.text.toString().toInt()
            val numero2: Int = binding.numero2.text.toString().toInt()
            val resultado = multiplicacion(numero1, numero2);
            val func = FuncionesController();
            func.multiplicacion(numero1, numero2);
            binding.resultado.text = resultado.toString()

        }

        binding.buttondivision.setOnClickListener{
            val numero1: Int = binding.numero1.text.toString().toInt()
            val numero2: Int = binding.numero2.text.toString().toInt()
            val resultado = division(numero1, numero2);
            val func = FuncionesController();
            func.division(numero1, numero2);
            binding.resultado.text = resultado.toString()

        }




    }

    fun suma(num:Int, num2:Int):Int {

        var result:Int = num +num2;

        return result;
    }

    fun resta(num:Int, num2:Int):Int {

        var result:Int = num -num2;

        return result;
    }

    fun multiplicacion(num:Int, num2:Int):Int {

        var result:Int = num *num2;

        return result;
    }

    fun division(num:Int, num2:Int):Int {

        var result:Int = num /num2;

        return result;
    }




}

