package com.phwnam.lab1_ph35329

fun main(){
    println("\n-------VD1: Hello World-------")

    println("\n-------VD2: Hàm print-------")
    printMessage("Hello")

    println("\n-------VD3: Hàm sum-------")
    val x = 1
    val y = 2
    println("X = $x, Y =$y")
    println("Tổng 2 số x và y là: ${sum(x,y)}")

    println("\n-------VD4: Hàm multiply-------")
    println(multiply(2,4))

    println("\n-------VD5: Hàm printMessageWithPrefix-------")
    printMessageWithPrefix("Hello")

    print("\n-------VD6: ")
    printMessageWithPrefix("Hello","Hello1")

    println("\n-------VD7: When-------")
    cases(1)
    cases(2)

    println("\n-------VD8: For-------")
    val vinfasts = listOf("VF7","VF8","VF9")
    for (xe in vinfasts){
        println("Tôi có xe Vinfast $xe")
    }

    println("\n-------VD9: While-------")
    var diXe = 0
    var doXang = 0

    while (diXe < 2){
        println("Đi xe")
        diXe ++
    }

    println("\n-------VD10:Do while-------")
    do{
        println("Đổ xăng")
        doXang ++
    }while (doXang < diXe)
}

//Ví dụ 1
fun printMessage(message: String): Unit {                               // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}
fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun cases(obj: Any){
    when (obj) {
        1 -> println("Trường hợp 1")
        2 -> println("Trường hợp 2")
    }
}





