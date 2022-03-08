package Animais

class Cavalo (
        nome: String, tipo: String, especie: String,
        val raca: String
    ) : Animal(nome, tipo, especie) {

        fun relinchar(){
            println("Relinchando")
        }

        override fun patada() {
            println("Dando Patada")
        }

        override fun rosna() {
            TODO("Not yet implemented")
        }

        override fun correndo() {
            println("Correndo")
        }

    }
}