package POO
fun main () {
class ListadeCompras {

    println ("Digite o seu nome: ")
    var nome = readLine()!!

    println ("Digite o seu endereço: ")
    var endereco = readLine()!!

    print("Digite o seu telefone: ")
    var telefone = readLine()!!

    try {
        val cliente = Cliente(
            nome, endereco,
            telefone
        )

        while(true){

            println("Menu")

            println("1 - Adicione itens no carrinho")
            println("2 - Remove itens do carrinho")
            println("3 - Liste os itens do carrinho")
            println("Digite outro numero para sair")

            var opc = 0

            while (true){
                println("\nDigite a opção desejada: ")

                try {
                    opc = readLine()!!.toInt()
                    break
                }catch (e: Exception){
                    println("Valor inválido")
                }
            }

            when(opc){

                1 -> {
                }
                }
                    println("Digite o item a ser adicionado: ")
                    val item = readLine()!!
                    cliente.addCompra(item)
                }
                2 -> {
                    println("Digite o item a ser removido: ")
                    val item = readLine()!!
                    cliente.removeCompra(item)
                }

                3 -> cliente.listarCompras()

                else -> break

            }

        }

    }

    }



}