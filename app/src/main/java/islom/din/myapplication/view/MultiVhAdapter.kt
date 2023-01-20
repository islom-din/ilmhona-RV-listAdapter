package islom.din.myapplication.view

import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import islom.din.myapplication.R
import islom.din.myapplication.model.ImageMessage
import islom.din.myapplication.model.Message
import islom.din.myapplication.model.SimpleMessage
import islom.din.myapplication.model.VideoMessage

class MultiVhAdapter : ListAdapter<Message, RecyclerView.ViewHolder>(
    MessageDiffCallback()
) {
    override fun getItemViewType(position: Int): Int {
        return if (getItem(position).simpleMessage != null)
            SIMPLE_MESSAGE
        else if (getItem(position).imageMessage != null) IMAGE_MESSAGE
        else VIDEO_MESSAGE
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == SIMPLE_MESSAGE)
            SimpleMessageViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.simple_message_rv_item, parent, false)
            )
        else if (viewType == IMAGE_MESSAGE)
            ImageMessageViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.image_message_rv_item, parent, false)
            )
        else
            VideoMessageViewHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.video_message_rv_item,parent,false))

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is SimpleMessageViewHolder)
            holder.configure(getItem(position).simpleMessage)
        else if (holder is ImageMessageViewHolder)
            holder.configure(getItem(position).imageMessage)
        else if (holder is VideoMessageViewHolder)
            holder.configure(getItem(position).videoMessage)
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
    inner class VideoMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val videoView : VideoView = itemView.findViewById(R.id.videoView)

        fun configure(videoMessage: VideoMessage?){
            Log.d("MyERROR","${itemView.context.packageName}")
            if (videoMessage == null)
                throw RuntimeException("Video Message is not found somehow")

            //Video properties
            val path = "android.resource://" + itemView.context.packageName + "/" + videoMessage.videoPath
            val uri = Uri.parse(path)
            videoView.setVideoURI(uri)
            videoView.setOnPreparedListener {
                it.start()
                val videoRatio = it.videoWidth / it.videoHeight.toFloat()
                val screenRatio = videoView.width / videoView.height.toFloat()
                val scale = videoRatio / screenRatio
                if (scale > 1f)
                    videoView.scaleX = scale
                else
                    videoView.scaleY = 1f / scale
            }
        }
    }

    companion object {
        private const val SIMPLE_MESSAGE = 0
        private const val IMAGE_MESSAGE = 1
        private const val VIDEO_MESSAGE = 2
    }
}