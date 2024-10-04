
fun calculadora() {
    println("Digite o primeiro valor: ")
    val n1 = readLine()?.toIntOrNull()
    println("Digite o segundo valor: ")
    val n2 = readLine()?.toIntOrNull()

    if(n1 == null || n2 == null) {
        println("Insira um valor válido!")
        return
    }

    println("Escolha a operação!")
    println("1 - Adição")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")
    println("5 - Porcentagem")
    println("6 - Potência")
    val escolha = readLine()


    when(escolha) {
        "1" -> println("A soma de é: ${n1 + n2}")
        "2" -> println("A subtração é: ${n1 - n2}")
        "3" -> println("A multiplicação é: ${n1 * n2}")
        "4" -> {
            if (n2 != 0) {
                println("A divisão é: ${n1 / n2}")
            } else {
                println("Erro: Divisão por zero não é permitida.")
            }
        }
        "5" -> println("$n1% de $n2 é: ${(n1 * n2)/100}%")
        "6" -> println("A potência é: ${n1 * n1}")

        else -> println("Insira uma operação válida")
    }
}

fun main() {
    calculadora()
}
