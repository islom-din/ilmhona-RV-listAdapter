package islom.din.myapplication.viewmodel


import islom.din.myapplication.model.MessageRepository
import islom.din.myapplication.model.Users

class MyViewModel {
    private val repository = MessageRepository()

    fun getNewData(): MutableList<Users> {
        return repository.getNewData()
    }
}