fun main () {
    val amount = 10000
    val minTax = 35
    val tax = 0.75

    val totalTax = amount * tax / 100
    val result = if (totalTax < minTax) minTax else totalTax
    println("Ваша комиссия: $result рублей")
}