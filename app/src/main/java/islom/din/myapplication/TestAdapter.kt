package islom.din.myapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TestAdapter : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    private var listOfData: List<String> = mutableListOf()

    fun updateListOfData(newListOfData: List<String>) {
        this.listOfData = newListOfData
        notifyDataSetChanged()
    }

    // этот метод будет вызван столько раз, сколько элементов поместится на экран!
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        // 1) Получили inflater для того, чтобы превратить лейаут в объект класса view
        val layoutInflater = LayoutInflater.from(parent.context)

        // 2) Получили из нашего xml - лейату объект класса View
        val view = layoutInflater.inflate(R.layout.rv_item, parent, false)

        // 3) Создали этот несчастный вьюхолдер и вернули его! :)
        val viewHolder = TestViewHolder(view)
        Log.d("recycler_view_test", "creating viewHolder. Hard operation!!!")
        return viewHolder
    }

    // вызывается для каждого элемента в списке!
    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.configure(listOfData[position])
        if(position == 8) {
            holder.textView.setTextColor(holder.itemView.context.resources.getColor(R.color.purple_500))
        }
    }

    override fun getItemCount(): Int {
        return listOfData.size
    }

    inner class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.findViewById<TextView>(R.id.titleView)

        fun configure(title: String) {
            textView.text = title
        }
    }
}