package islom.din.myapplication.new_lesson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import islom.din.myapplication.ItemDiffCallback
import islom.din.myapplication.MyString
import islom.din.myapplication.R

//NEW
// step 2
class NewTestAdapter : ListAdapter<MyString, NewTestAdapter.TestViewHolder>(
    ItemDiffCallback() // реализация в другом файле
) {

    var onItemClick: ((Int) -> Unit)? = null

    // этот метод будет вызван столько раз, сколько элементов поместится на экран!
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestViewHolder {
        // 1) Получили inflater для того, чтобы превратить лейаут в объект класса view
        val layoutInflater = LayoutInflater.from(parent.context)

        // 2) Получили из нашего xml - лейаут объект класса View
        val view = layoutInflater.inflate(R.layout.rv_item, parent, false)

        // 3) Создали этот несчастный вьюхолдер и вернули его! :)
        val viewHolder = TestViewHolder(view)
        return viewHolder
    }

    // вызывается для каждого элемента в списке!
    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.configure(getItem(position))
    }

    inner class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.findViewById<TextView>(R.id.titleView)

        init {
            itemView.setOnClickListener {
                // само нажатие происходит здесь!
                onItemClick?.invoke(adapterPosition) // onItemClick()
            }
        }

        fun configure(myString: MyString) {
            textView.text = myString.string
            if(myString.isSelected) {
                textView.setTextColor(itemView.context.resources.getColor(R.color.purple_500))
            } else {
                // если элемент не выбран!!!
                textView.setTextColor(itemView.context.resources.getColor(R.color.black))
            }
        }
    }
}