package islom.din.myapplication.multiviewholder.data

data class Message(
    val id: Int,
    val simpleMessage: SimpleMessage?,
    val imageMessage: ImageMessage?
)

data class SimpleMessage(
    val message: String
)

data class ImageMessage(
    val imageRes: Int
)

