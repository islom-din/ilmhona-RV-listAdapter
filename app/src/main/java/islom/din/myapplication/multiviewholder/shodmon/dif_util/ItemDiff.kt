package islom.din.myapplication.multiviewholder.shodmon.dif_util

import androidx.recyclerview.widget.DiffUtil
import islom.din.myapplication.multiviewholder.shodmon.data.Country

class ItemDiff : DiffUtil.ItemCallback<Country>() {
    override fun areItemsTheSame(oldItem: Country, newItem: Country): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Country, newItem: Country): Boolean {
        return oldItem == newItem
    }


}