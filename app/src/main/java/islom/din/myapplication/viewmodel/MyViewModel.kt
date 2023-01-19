package islom.din.myapplication.viewmodel

import islom.din.myapplication.R
import islom.din.myapplication.model.ImageMessage
import islom.din.myapplication.model.Message
import islom.din.myapplication.model.MessageRepository
import islom.din.myapplication.model.SimpleMessage

class MyViewModel {
    private val repository = MessageRepository()

    fun getNewData(): MutableList<Message> {
        return repository.getNewData()
    }
}