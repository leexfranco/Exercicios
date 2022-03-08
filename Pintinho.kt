package Animais

class Pintinho (
    nome: String, tipo: String, especie: String,
    val raca: String
) : Animal(nome, tipo, especie) {

    fun barulho (){
        println("Piu Piu")
    }

    override fun esconder() {
        println("Se escondendo")
    }

    override fun rosna() {
        TODO("Not yet implemented")
    }

    override fun correndo() {
        println("Correndo")
    }

}