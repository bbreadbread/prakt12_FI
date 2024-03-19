class One (var a: Double, var b: Double){
    fun per(){
        try {
                print("Сторона а: ")
                a = readLine()!!.toDouble()
                print("Сторона b: ")
                b = readLine()!!.toDouble()
                if(a<=0||b<=0) {
                    println("Стороны должны быть положительными. Ошибка.")
                    a = 0.0
                    b = 0.0
            }
    }
    catch (e:Exception){
        println("Введен неверный формат")
    }
    }
    fun S(){
        println("Площадь: ${a*b}")
    }
    fun  P(){
        println("Периметр: ${(a+b)*2}")
    }
}