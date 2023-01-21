package islom.din.myapplication.model

data class Message(
    val id: Int,
    val simpleMessage: SimpleMessage?,
    val imageMessage: ImageMessage?,
    val videoMessage: VideoMessage?
)

