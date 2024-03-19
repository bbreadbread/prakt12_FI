import  kotlinx.coroutines.*

suspend fun main() = runBlocking{
    var listRep = mutableListOf<Two>()
        while (true) {
            try {
            print("\nИмя пользователя: ")
            var name = readln()

            print("Пароль: ")
            var password = readln()

            if (password.length>7) {
                print("Кол-во репозиториев:")
                var cRep = readln()!!.toInt()
                    if(cRep>0) {
                        print("Репозитории открытые? (да - 1 / нет - 0)")
                        var yes = readln().toInt()
                        if (yes != 1 && yes != 0) throw Exception()
                        val nani: Boolean = yes == 1
                        listRep.add(Two(name, password, cRep, nani))

                        print("Для выхода напишите\"Стоп\"")
                        var bb = readln()
                        if (bb == "Стоп" || bb == "стоп") break

                        delay(800L)
                    }
                    else
                    {
                        print("Должен быть хотя бы один репозиторий.\n")
                    }
            }
            else
            {
                print("Пароль должен состоять из не менее 8 символов.\n")
            }
        }
    catch (e:Exception) {
        println("Ошибочка..")
    }
        }
    print("\nОжидайте.\n")
    delay(1300)
    val sorter = listRep.first().Sort(listRep)
    sorter.forEach {
        println(it.Get_Info())
    }
}
