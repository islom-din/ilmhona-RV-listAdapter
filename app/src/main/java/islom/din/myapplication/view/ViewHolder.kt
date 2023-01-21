package islom.din.myapplication.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import islom.din.myapplication.R
import islom.din.myapplication.model.ImageMessage
import islom.din.myapplication.model.SimpleMessage
import islom.din.myapplication.model.Users
import java.lang.RuntimeException


class ViewHolders(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private fun configure(simpleMessage: SimpleMessage?) {
    val titleView: TextView = itemView.findViewById(R.id.text_view)
        titleView.text = simpleMessage?.message
    }

    private fun configure(imageMessage: ImageMessage?) {
    val  imageView: ImageView = itemView.findViewById(R.id.image_view)
        if (imageMessage == null) {
            throw RuntimeException("image Message cannot be null if there's created Image VH")
        }
        imageView.setImageResource(imageMessage.imageRes)
    }
    fun bindUser1(user1: Users.User1) {
        val text1 = itemView.findViewById<TextView>(R.id.users1_text)
        text1.text = user1.messange
    }

    fun bindUser11(user11: Users.User11) {
        val imge1 = itemView.findViewById<ImageView>(R.id.users1_imageView)

        imge1.setImageResource(user11.messangeImg)
    }

    fun bindUsers2(user2: Users.User2) {
        val text2 = itemView.findViewById<TextView>(R.id.users2_text)

        text2.text = user2.messange2

    }

    fun bindUsers22(users22: Users.User22) {

        val imge2 = itemView.findViewById<ImageView>(R.id.users2_imageView)

        imge2.setImageResource(users22.messangeImg2)
    }

    fun usersMadel(users: Users) {
        when (users) {
            is Users.User1 -> bindUser1(users)
            is Users.User2 -> bindUsers2(users)
            is Users.User11 -> bindUser11(users)
            is Users.User22 -> bindUsers22(users)
            is SimpleMessage ->configure(users)
            is ImageMessage-> configure(users)

        }
    }
}