package islom.din.myapplication

import androidx.recyclerview.widget.DiffUtil

//NEW
// step 3
class ItemDiffCallback : DiffUtil.ItemCallback<MyString>() {
    override fun areItemsTheSame(
        oldItem: MyString,
        newItem: MyString
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: MyString,
        newItem: MyString
    ): Boolean {
        return oldItem == newItem
    }
}