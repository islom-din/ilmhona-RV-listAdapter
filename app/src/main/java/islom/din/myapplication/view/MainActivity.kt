package islom.din.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import islom.din.myapplication.R
import islom.din.myapplication.model.Users
import islom.din.myapplication.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private val viewModel = MyViewModel()

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

        val adapter = MultiVhAdapter()
        adapter.submitList(viewModel.getNewData() as List<Users>?)
        recyclerView.adapter = adapter
    }
}

