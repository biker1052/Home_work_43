package kg.tutorialapp.home_work_43
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var myAdapter: MyAdapter
    private var list = mutableListOf<Item>()
    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myAdapter = MyAdapter()
        val recyclerViev = findViewById<RecyclerView>(R.id.recyclerView)
        val btn1 = findViewById<Button>(R.id.button)
        val txt = findViewById<EditText>(R.id.editText)
        recyclerViev.adapter = myAdapter
        setup(btn1,txt)
    }

    private fun setup(btn1:Button,txt:TextView) {
        btn1.setOnClickListener {
            list.add(Item(i++, txt.text.toString()))
            setupData()
            Log.i("setup", list.count().toString())
        }

    }

    private fun setupData() {
        myAdapter.setItems(list)
    }
}