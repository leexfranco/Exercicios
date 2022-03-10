import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class calculadoraeest {
    
    val calculadora = calculadora()


    @Test
    fun soma() {
        assertEquals(6, calculadora.soma(3, 3))
    }

    @Test
    fun subtracao() {
        assertEquals(3, calculadora.subtracao(6, 3))
    }

    @Test
    fun multiplicacao() {
        assertEquals(9, calculadora.multiplicacao(3, 3))
    }

    @Test
    fun divisao() {
        assertEquals(1, calculadora.divisao(3, 3))
    }
}