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
import islom.din.myapplication.model.Message
import islom.din.myapplication.model.SimpleMessage
import java.lang.RuntimeException

class MultiVhAdapter : ListAdapter<Message, RecyclerView.ViewHolder>(
    MessageDiffCallback()
) {
    override fun getItemViewType(position: Int): Int {
        return if (getItem(position).simpleMessage != null)
            SIMPLE_MESSAGE
        else IMAGE_MESSAGE
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == SIMPLE_MESSAGE)
            SimpleMessageViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.simple_message_rv_item, parent, false)
            )
        else
            ImageMessageViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.image_message_rv_item, parent, false)
            )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is SimpleMessageViewHolder)
            holder.configure(getItem(position).simpleMessage)
        else if (holder is ImageMessageViewHolder)
            holder.configure(getItem(position).imageMessage)
    }

    inner class SimpleMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleView: TextView = itemView.findViewById(R.id.text_view)

        fun configure(simpleMessage: SimpleMessage?) {
           titleView.text = simpleMessage?.message
        }
    }

    inner class ImageMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.image_view)

        fun configure(imageMessage: ImageMessage?) {
            if (imageMessage == null) {
                throw RuntimeException("image Message cannot be null if there's created Image VH")
            }
            imageView.setImageResource(imageMessage.imageRes)
        }
    }

    companion object {
        private const val SIMPLE_MESSAGE = 0
        private const val IMAGE_MESSAGE = 1
    }
}