package islom.din.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import islom.din.myapplication.multiviewholder.adapter.MultiVhAdapter
import islom.din.myapplication.multiviewholder.data.ImageMessage
import islom.din.myapplication.multiviewholder.data.Message
import islom.din.myapplication.multiviewholder.data.SimpleMessage
import islom.din.myapplication.multiviewholder.shodmon.adapter.CountryAdapter
import islom.din.myapplication.multiviewholder.shodmon.viewModel.MyVewModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private lateinit var countryViewHolder: CountryAdapter
    private val myViewHolder = MyVewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        countryViewHolder = CountryAdapter()

        val layoutManger = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        recyclerView.layoutManager = layoutManger

//        val adapter = MultiVhAdapter()
//        adapter.submitList(getNewData())
//        recyclerView.adapter = adapter
        countryViewHolder.submitList(myViewHolder.getData())
        recyclerView.adapter = countryViewHolder
    }

    private fun getNewData() : MutableList<Message> {
        val newList = mutableListOf(
            Message(
                id = 1,
                simpleMessage = SimpleMessage(message = "Не спи на уроке )"),
                imageMessage = null
            ),
            Message(
                id = 2,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.hobbit)
            ),
            Message(
                id = 3,
                simpleMessage = SimpleMessage(message = "Do not sleep!!!"),
                imageMessage = null
            ),
            Message(
                id = 4,
                simpleMessage = SimpleMessage(message = "Hello proSkills message"),
                imageMessage = null
            ),
            Message(
                id = 5,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
            ),
            Message(
                id = 6,
                simpleMessage = SimpleMessage(message = "Hello world message"),
                imageMessage = null
            ),
            Message(
                id = 7,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
            ),
            Message(
                id = 8,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.lord_of_the_rings)
            ),
            Message(
                id = 1,
                simpleMessage = SimpleMessage(message = "Не спи на уроке )"),
                imageMessage = null
            ),
            Message(
                id = 2,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.hobbit)
            ),
            Message(
                id = 3,
                simpleMessage = SimpleMessage(message = "Do not sleep!!!"),
                imageMessage = null
            ),
            Message(
                id = 4,
                simpleMessage = SimpleMessage(message = "Hello proSkills message"),
                imageMessage = null
            ),
            Message(
                id = 5,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
            ),
            Message(
                id = 6,
                simpleMessage = SimpleMessage(message = "Hello world message"),
                imageMessage = null
            ),
            Message(
                id = 7,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
            ),
            Message(
                id = 8,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.lord_of_the_rings)
            ),
            Message(
                id = 1,
                simpleMessage = SimpleMessage(message = "Не спи на уроке )"),
                imageMessage = null
            ),
            Message(
                id = 2,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.hobbit)
            ),
            Message(
                id = 3,
                simpleMessage = SimpleMessage(message = "Do not sleep!!!"),
                imageMessage = null
            ),
            Message(
                id = 4,
                simpleMessage = SimpleMessage(message = "Hello proSkills message"),
                imageMessage = null
            ),
            Message(
                id = 5,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
            ),
            Message(
                id = 6,
                simpleMessage = SimpleMessage(message = "Hello world message"),
                imageMessage = null
            ),
            Message(
                id = 7,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
            ),
            Message(
                id = 8,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.lord_of_the_rings)
            ),
            Message(
                id = 1,
                simpleMessage = SimpleMessage(message = "Не спи на уроке )"),
                imageMessage = null
            ),
            Message(
                id = 2,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.hobbit)
            ),
            Message(
                id = 3,
                simpleMessage = SimpleMessage(message = "Do not sleep!!!"),
                imageMessage = null
            ),
            Message(
                id = 4,
                simpleMessage = SimpleMessage(message = "Hello proSkills message"),
                imageMessage = null
            ),
            Message(
                id = 5,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
            ),
            Message(
                id = 6,
                simpleMessage = SimpleMessage(message = "Hello world message"),
                imageMessage = null
            ),
            Message(
                id = 7,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.game_of_thrones)
            ),
            Message(
                id = 8,
                simpleMessage = null,
                imageMessage = ImageMessage(imageRes = R.drawable.lord_of_the_rings)
            ),
        )
        return newList
    }
}

