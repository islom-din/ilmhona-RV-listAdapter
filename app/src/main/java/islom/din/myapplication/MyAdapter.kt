package islom.din.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private var listOfData: List<String> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.rv_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(listOfData[position])
    }

    override fun getItemCount(): Int = listOfData.size

    fun setData(listOfNewData: List<String>) {
        this.listOfData = listOfNewData
        notifyDataSetChanged()
    }

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val textView: TextView

        init {
            textView = itemView.findViewById(R.id.titleView)
        }

        fun bind(title: String) {
            textView.text = title
        }
    }
}