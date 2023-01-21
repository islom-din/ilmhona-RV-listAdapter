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
        items.add(Message(3, null, ImageMessage(R.drawable.game_of_thrones)))
        items.add(Message(4, SimpleMessage("Tajikistan"), null))
        items.add(Message(5, null, ImageMessage(R.drawable.pizza_001_copy)))
        items.add(Message(6, SimpleMessage("Mother Russia"), null))
        items.add(Message(5, null, ImageMessage(R.drawable.pizza_002)))
        items.add(Message(6, SimpleMessage("The other world"), null))


        return items
    }


}