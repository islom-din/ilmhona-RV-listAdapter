package islom.view

import androidx.recyclerview.widget.DiffUtil
import islom.model.Message

class MessageDiffCallback : DiffUtil.ItemCallback<Message>() {
    override fun areItemsTheSame(
        oldItem: Message,
        newItem: Message
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: Message,
        newItem: Message
    ): Boolean {
        return oldItem == newItem
    }
}