package islom.din.myapplication.model

import islom.din.myapplication.R

class MessageRepository {
    private val newList = mutableListOf(
     Users.User22(R.drawable.game_of_thrones),
      Users.User2("good"),
        Users.User1("hllo"),
        Users.User11(R.drawable.hobbit),
        SimpleMessage("title"),
        ImageMessage(R.drawable.lord_of_the_rings)
    )

    fun getNewData() : MutableList<Users> {
        return newList
    }
}