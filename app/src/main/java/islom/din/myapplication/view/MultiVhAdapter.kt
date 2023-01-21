package islom.din.myapplication.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import islom.din.myapplication.R
import islom.din.myapplication.model.ImageMessage
import islom.din.myapplication.model.SimpleMessage

import islom.din.myapplication.model.Users
import java.lang.RuntimeException

class MultiVhAdapter : ListAdapter<Users, ViewHolders>(
    MessageDiffCallback()
) {
    override fun getItemViewType(position: Int): Int {
return  when (getItem(position)){
    is ImageMessage -> IMAGE_MESSAGE
   is SimpleMessage -> SIMPLE_MESSAGE
    is Users.User1 -> TEXT_USER1
    is Users.User11-> IMAGE_USER1
    is Users.User2 -> TEXT_USER2
    is Users.User22 -> IMAGE_USER2
}
        /*return if (getItem(position).simpleMessage != null)
            SIMPLE_MESSAGE
        else IMAGE_MESSAGE*/
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolders {
        val layout = when(viewType){
            SIMPLE_MESSAGE -> R.layout.simple_message_rv_item
            IMAGE_MESSAGE->  R.layout.image_message_rv_item
            TEXT_USER1 ->R.layout.users1_text_layout
            IMAGE_USER1->R.layout.users1_imsg_layout
            IMAGE_USER2->R.layout.users2_img_layout
            else ->R.layout.users2_text_layout
        }
        return ViewHolders(LayoutInflater.from(parent.context).inflate(layout,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolders, position: Int) {
        holder.usersMadel(getItem(position))
    }


//    inner class SimpleMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
//        val titleView: TextView = itemView.findViewById(R.id.text_view)
//
//        fun configure(simpleMessage: SimpleMessage?) {
//           titleView.text = simpleMessage?.message
//        }
//    }
//
//    inner class ImageMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
//        val imageView: ImageView = itemView.findViewById(R.id.image_view)
//
//        fun configure(imageMessage: ImageMessage?) {
//            if (imageMessage == null) {
//                throw RuntimeException("image Message cannot be null if there's created Image VH")
//            }
//            imageView.setImageResource(imageMessage.imageRes)
//        }
//    }

    companion object {
        private const val SIMPLE_MESSAGE = 0
        private const val IMAGE_MESSAGE = 1
        private const val IMAGE_USER1 = 2
        private const val TEXT_USER1 = 3
        private const val IMAGE_USER2 = 4
        private const val TEXT_USER2 = 5

    }

}