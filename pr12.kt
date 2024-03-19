import  kotlinx.coroutines.*

suspend fun main()= coroutineScope<Unit>{
    try {
        println("Введите количество повторов:")
        var n = readLine()!!.toInt()
        if(n >0) {
            var s = One(0.0, 0.0)
            launch {
                for (i in 0..n - 1) {
                    println("Цикл №${i + 1}")
                    s.per()
                    delay(900L)
                    if (s.a >0 && s.b>0)
                    {
                        s.S()
                        delay(900L)
                        s.P()
                        delay(1200L)
                    }
                   else println("Ошибка")
                }
            }
        }
        else println("Нужен хотя бы один повтор")
    }
    catch (e:Exception){
        println("Введен неверный формат")
    }
}