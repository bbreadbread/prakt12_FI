import  kotlinx.coroutines.delay
open class Two (var name: String, var password: String, var cRep: Int, var yes: Boolean) {
        suspend fun Sort(listRep: List<Two>): List<Two> {
            delay(1300L)
            return listRep.filter { it.yes}.sortedWith(compareBy { it.cRep })
        }
        suspend fun Get_Info(): String{
            delay(1200L)
            return "Пользователь: $name, Пароль: $password, Кол-во репозиториев: $cRep"
        }
}
