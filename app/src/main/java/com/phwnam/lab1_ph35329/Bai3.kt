package com.phwnam.lab1_ph35329

fun main() {

//    //Khai báo biến: cách 1 - dùng val
//    val a = 1
//    val b = 2
//    val c = a+b
//    println("Tổng 2 số $a và $b là: $c")
//
//    //Khai báo biến: rõ kiểu dữ liệu
//
//    var sothunhat : Int = 3
//    var sothuhai: Float = 4f
//
//    var mess : String = "Tích 2 số $sothunhat va $sothuhai la: ${sothunhat * sothuhai}"
//    println(mess)
//
//    val soA = 5
//    val soB = 5f
//    println("Thương 2 số $soA và $soB là: ${phepChia(soA, soB)}")
//
//    val diachi = """
//        Quận 12,
//        TPHCM
//    """.trimIndent()
//    println(diachi)

    var a = 0.0
    var b = 0.0
    print("Nhập a: ")
    var s = readLine()
    if(s != null) a = s.toDouble()
    print("Nhập b: ")
    s = readLine()
    if (s != null) b = s.toDouble()
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))
}

fun phepChia (soA: Int, soB : Float) : Float {
    if(soB == 0f){
        return 0f
    }
    val thuong = soA/soB
    return thuong;
}

class lab1{}