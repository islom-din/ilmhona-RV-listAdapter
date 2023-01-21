package islom.din.myapplication.model

import islom.din.myapplication.R

class MessageRepository {
    private val newList = mutableListOf(
        Message(
            id = 1,
            simpleMessage = SimpleMessage(message = "Не спи на уроке )"),
            imageMessage = null,
            videoMessage = null
        ),
        Message(
            id = 2,
            imageMessage = ImageMessage(imageRes = R.drawable.hobbit),
            simpleMessage = null,
            videoMessage = null
        ),
        Message(
            id = 3,
            videoMessage = VideoMessage(videoPath = R.raw.video_2),
            simpleMessage = null,
            imageMessage = null
        ),
        Message(
            id = 4,
            simpleMessage = SimpleMessage(message = "Hello proSkills message"),
            imageMessage = null,
            videoMessage = null
        ),
        Message(
            id = 3,
            videoMessage = VideoMessage(videoPath = R.raw.video_1),
            simpleMessage = null,
            imageMessage = null
        ),
        Message(
            id = 6,
            simpleMessage = SimpleMessage(message = "Hello world message"),
            imageMessage = null,
            videoMessage = null
        ),
        Message(
            id = 7,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones),
            videoMessage = null
        ),
        Message(
            id = 3,
            videoMessage = VideoMessage(videoPath = R.raw.video_2),
            simpleMessage = null,
            imageMessage = null
        ),
        Message(
            id = 1,
            simpleMessage = SimpleMessage(message = "Не спи на уроке )"),
            imageMessage = null,
            videoMessage = null
        ),
        Message(
            id = 3,
            videoMessage = VideoMessage(videoPath = R.raw.video_1),
            simpleMessage = null,
            imageMessage = null
        ),
        Message(
            id = 3,
            simpleMessage = SimpleMessage(message = "Do not sleep!!!"),
            imageMessage = null,
            videoMessage = null
        ),
        Message(
            id = 4,
            simpleMessage = SimpleMessage(message = "Hello proSkills message"),
            imageMessage = null,
            videoMessage = null
        ),
        Message(
            id = 3,
            videoMessage = VideoMessage(videoPath = R.raw.video_2),
            simpleMessage = null,
            imageMessage = null
        ),
        Message(
            id = 6,
            simpleMessage = SimpleMessage(message = "Hello world message"),
            imageMessage = null,
            videoMessage = null
        ),
        Message(
            id = 3,
            videoMessage = VideoMessage(videoPath = R.raw.video_1),
            simpleMessage = null,
            imageMessage = null
        ),
        Message(
            id = 8,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.lord_of_the_rings),
            videoMessage = null
        ),
        Message(
            id = 3,
            videoMessage = VideoMessage(videoPath = R.raw.video_2),
            simpleMessage = null,
            imageMessage = null
        ),
        Message(
            id = 2,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.hobbit),
            videoMessage = null
        ),
        Message(
            id = 3,
            simpleMessage = SimpleMessage(message = "Do not sleep!!!"),
            imageMessage = null,
            videoMessage = null
        ),
        Message(
            id = 3,
            videoMessage = VideoMessage(videoPath = R.raw.video_1),
            simpleMessage = null,
            imageMessage = null
        ),
        Message(
            id = 5,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones),
            videoMessage = null
        ),
        Message(
            id = 6,
            simpleMessage = SimpleMessage(message = "Hello world message"),
            imageMessage = null,
            videoMessage = null
        ),
        Message(
            id = 3,
            videoMessage = VideoMessage(videoPath = R.raw.video_2),
            simpleMessage = null,
            imageMessage = null
        ),
        Message(
            id = 8,
            simpleMessage = null,
            imageMessage = ImageMessage(imageRes = R.drawable.lord_of_the_rings),
            videoMessage = null
        ),
    )

    fun getNewData() : MutableList<Message> {
        return newList
    }
}