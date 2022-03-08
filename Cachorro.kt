package Animais

class Cachorro (
        nome: String, tipo: String, especie: String,
        val raca: String
    ) : Animal(nome, tipo, especie) {

        fun latir(){
            println("Latindo")
        }

        override fun farejar() {
            println("Farejando")
        }

        override fun rosna() {
            TODO("Not yet implemented")
        }

        override fun correr() {
            println("Correndo")
        }

    }
