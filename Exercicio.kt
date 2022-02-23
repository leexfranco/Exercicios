fun main (){
    print("Digite sua idade: ")
    val idade = readLine()!!.toInt()


    when (idade) {

        in 10..14 -> {

            println("Sua categoria é infantil")


        }


        in 15..17 -> {

            println("Sua categoria é juvenil")


        }

        in 18..25 -> {

            println("Sua categoria é adulto")

        }
        }
    }
