package islom.din.myapplication.view

import androidx.recyclerview.widget.DiffUtil
import islom.din.myapplication.model.Users


class MessageDiffCallback : DiffUtil.ItemCallback<Users>() {
    override fun areItemsTheSame(
        oldItem:Users,
        newItem: Users
    ): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(
        oldItem: Users,
        newItem: Users
    ): Boolean {
        return oldItem == newItem
    }
}