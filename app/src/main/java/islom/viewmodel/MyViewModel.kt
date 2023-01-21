package islom.viewmodel

import islom.din.myapplication.R
import islom.model.Collage
import islom.model.Message
import islom.model.SimpleMessage


class MyViewModel {

    val newList = mutableListOf<Message>(
        Message(1,
            Collage(R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground),
            null),
        Message(2,
            null,
            SimpleMessage("This is background",R.drawable.ic_launcher_background)),
        Message(3,
            Collage(R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background),
            null),
        Message(4,
            null,
            SimpleMessage("This is Android`s ICON",R.drawable.ic_launcher_foreground))
    )

    fun getNewData(): MutableList<Message> = newList
}