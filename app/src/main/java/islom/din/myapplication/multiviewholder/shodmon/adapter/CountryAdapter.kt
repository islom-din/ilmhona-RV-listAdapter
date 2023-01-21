package islom.din.myapplication.multiviewholder.shodmon.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import islom.din.myapplication.R
import islom.din.myapplication.multiviewholder.adapter.MultiVhAdapter
import islom.din.myapplication.multiviewholder.data.ImageMessage
import islom.din.myapplication.multiviewholder.data.Message
import islom.din.myapplication.multiviewholder.data.SimpleMessage
import islom.din.myapplication.multiviewholder.dif_util.MessageDiffCallback
import islom.din.myapplication.multiviewholder.shodmon.data.Country
import islom.din.myapplication.multiviewholder.shodmon.dif_util.ItemDiff

class CountryAdapter : ListAdapter<Message, RecyclerView.ViewHolder>(MessageDiffCallback()) {

    override fun getItemViewType(position: Int): Int {
        return if (getItem(position).simpleMessage != null)
            COUNTRY_NAME
        else COUNTRY_IMG
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == COUNTRY_NAME)
            CountryNameViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.simple_message_rv_item,parent,false))
        else CountryViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.image_view,parent,false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CountryNameViewHolder)
            getItem(position).simpleMessage?.let { holder.configName(it) }
        else if (holder is CountryViewHolder)
            getItem(position).imageMessage?.let { holder.configImage(it) }
    }

    inner class CountryViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
        private val countryImage : ImageView = itemView.findViewById(R.id.image)

        fun configImage(country: ImageMessage){
            countryImage.setImageResource(country.imageRes)
        }

    }

    inner class CountryNameViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        private val countryName : TextView = itemView.findViewById(R.id.text_view)

        fun configName(country: SimpleMessage){
            countryName.text = country.message
        }

    }
    companion object {
        private const val COUNTRY_NAME = 0
        private const val COUNTRY_IMG = 1

    }
}