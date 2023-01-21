package islom.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import islom.din.myapplication.R
import islom.model.Collage

import islom.model.Message
import islom.model.SimpleMessage
import java.lang.RuntimeException

class MultiVhAdapter: ListAdapter <Message, RecyclerView.ViewHolder>(
    MessageDiffCallback()
) {
    override fun getItemViewType(position: Int): Int {
        return if (getItem(position).simpleMessage != null)
            SIMPLE_MESSAGE
        else COLLAGE
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == SIMPLE_MESSAGE)
            SimpleMessageViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.fragment_simple_message, parent, false)
            )
        else
            CollageViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.fragment_collage, parent, false)
            )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is SimpleMessageViewHolder)
            holder.configure(getItem(position).simpleMessage)
        else if (holder is CollageViewHolder)
            holder.configure(getItem(position).collage)
    }

    inner class SimpleMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleView: TextView = itemView.findViewById(R.id.text)
        val image = itemView.findViewById<ImageView>(R.id.image)

        fun configure(simpleMessage: SimpleMessage?) {
            titleView.text = simpleMessage?.message
            image.setImageResource(simpleMessage!!.image)
        }
    }

    inner class CollageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val general_img: ImageView = itemView.findViewById(R.id.img_general)
        val top_img: ImageView = itemView.findViewById(R.id.img_top)
        val bottom_img: ImageView = itemView.findViewById(R.id.img_bottom)

        fun configure(collage: Collage?) {
            if (collage == null) {
                throw RuntimeException("image Message cannot be null if there's created Image VH")
            }
            general_img.setImageResource(collage.generalImage)
            top_img.setImageResource(collage.topImage)
            bottom_img.setImageResource(collage.bottomImage)
        }
    }


    companion object {
        private const val SIMPLE_MESSAGE = 0
        private const val COLLAGE = 1
    }
}