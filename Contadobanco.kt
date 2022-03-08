package POO

class Contadobanco {

        var nome = ""
        var tipo = 0
        var saldo = 0.0

        fun mSaldo(){
            println("O saldo da sua conta é R$$saldo")
        }

        fun deposito (valor: Double){
            if(valor <= 0){
                println("Depósito não realizado")
            }else{
                saldo += valor
                println("Depósito no valor de R$$valor realizado com sucesso!")
            }
        }

        fun saque (valor: Double){
            if(saldo <= 0){
                println("Saldo insuficiente")
            }else if(valor <= 0){
                println("Saque não realizado")
            }else if (valor > saldo){
                println("Valor insuficiente")
            }else{
                saldo -= valor
                println("Saque no valor de R$$valor realizado com sucesso!")
            }
        }


}