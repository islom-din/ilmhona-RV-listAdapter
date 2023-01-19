package islom.din.myapplication.model

import islom.din.myapplication.R

class MessageRepository {
    private val newList = mutableListOf(
        Message(
            id = 1,
            simpleMessage = SimpleMessage(message = "Не спи на уроке )"),
            imageMessage = null
        ),
        Message(
            id = 2,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.hobbit)
        ),
        Message(
            id = 3,
            simpleMessage = SimpleMessage(message = "Do not sleep!!!"),
            imageMessage = null
        ),
        Message(
            id = 4,
            simpleMessage = SimpleMessage(message = "Hello proSkills message"),
            imageMessage = null
        ),
        Message(
            id = 5,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
        ),
        Message(
            id = 6,
            simpleMessage = SimpleMessage(message = "Hello world message"),
            imageMessage = null
        ),
        Message(
            id = 7,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
        ),
        Message(
            id = 8,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.lord_of_the_rings)
        ),
        Message(
            id = 1,
            simpleMessage = SimpleMessage(message = "Не спи на уроке )"),
            imageMessage = null
        ),
        Message(
            id = 2,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.hobbit)
        ),
        Message(
            id = 3,
            simpleMessage = SimpleMessage(message = "Do not sleep!!!"),
            imageMessage = null
        ),
        Message(
            id = 4,
            simpleMessage = SimpleMessage(message = "Hello proSkills message"),
            imageMessage = null
        ),
        Message(
            id = 5,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
        ),
        Message(
            id = 6,
            simpleMessage = SimpleMessage(message = "Hello world message"),
            imageMessage = null
        ),
        Message(
            id = 7,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
        ),
        Message(
            id = 8,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.lord_of_the_rings)
        ),
        Message(
            id = 1,
            simpleMessage = SimpleMessage(message = "Не спи на уроке )"),
            imageMessage = null
        ),
        Message(
            id = 2,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.hobbit)
        ),
        Message(
            id = 3,
            simpleMessage = SimpleMessage(message = "Do not sleep!!!"),
            imageMessage = null
        ),
        Message(
            id = 4,
            simpleMessage = SimpleMessage(message = "Hello proSkills message"),
            imageMessage = null
        ),
        Message(
            id = 5,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
        ),
        Message(
            id = 6,
            simpleMessage = SimpleMessage(message = "Hello world message"),
            imageMessage = null
        ),
        Message(
            id = 7,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
        ),
        Message(
            id = 8,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.lord_of_the_rings)
        ),
    )

    fun getNewData() : MutableList<Message> {
        return newList
    }
}