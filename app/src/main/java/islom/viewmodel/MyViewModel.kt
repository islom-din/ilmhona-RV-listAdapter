package islom.viewmodel

import islom.din.myapplication.R
import islom.model.Collage
import islom.model.Message
import islom.model.SimpleMessage


class MyViewModel {

    val newList = mutableListOf<Message>(
        Message(1,
            Collage(R.drawable.c1g,
                R.drawable.c1t,
                R.drawable.c1b),
            null),
        Message(2,
            null,
            SimpleMessage("Garry Potter",R.drawable.c1g)),
        Message(3,
            Collage(R.drawable.hobbit,
                R.drawable.lord_of_the_rings,
                R.drawable.game_of_thrones),
            null),
        Message(4,
            null,
            SimpleMessage("Hobbit",R.drawable.hobbit))
    )

    fun getNewData(): MutableList<Message> = newList
}