package islom.din.myapplication.multiviewholder.shodmon.viewModel

import islom.din.myapplication.R
import islom.din.myapplication.multiviewholder.data.ImageMessage
import islom.din.myapplication.multiviewholder.data.Message
import islom.din.myapplication.multiviewholder.data.SimpleMessage

class MyVewModel {

    fun getData(): MutableList<Message> {
        val items: MutableList<Message> = mutableListOf()

        items.add(Message(1, null, ImageMessage(R.drawable.game_of_thrones)))

        items.add(Message(2, SimpleMessage("Canada"), null))
        items.add(Message(1, null, ImageMessage(R.drawable.game_of_thrones)))
        items.add(Message(2, SimpleMessage("Tajikistan"), null))

        return items
    }


}