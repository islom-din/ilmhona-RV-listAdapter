package islom.din.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import islom.din.myapplication.new_lesson.NewTestAdapter

// step 1

//NEW
data class MyString(
    val id: Int,
    val string: String,
    var isSelected: Boolean = false
)
// объект этого класса - item
// id и string - content

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)

        val layoutManger = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        recyclerView.layoutManager = layoutManger

        val adapter = NewTestAdapter()
        adapter.onItemClick = { index: Int ->
            adapter.submitList(getNewData(index))
        }
        adapter.submitList(getNewData())
        recyclerView.adapter = adapter
    }

    fun getNewData(indexOfSelectedElement: Int? = null) : MutableList<MyString> {
        val newList = mutableListOf(
            MyString(1,"Hello world"),
            MyString(2,"Orif"),
            MyString(3,"Qosim"),
            MyString(4, "Alisher"),
            MyString(5, "Behruz"),
            MyString(6, "Tehronshoh"),
        )
        newList.forEachIndexed { index, myString ->
            if (index == indexOfSelectedElement) {
                myString.isSelected = true
            }
        }
        return newList
    }
}

