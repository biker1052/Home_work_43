package kg.tutorialapp.home_work_43

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var myAdapter: MyAdapter
    private var list = mutableListOf<Item>()
    var i=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    private fun setup() {
       val btn1 = findViewById<Button>(R.id.button)
        val txt = findViewById<EditText>(R.id.editText)
        btn1.setOnClickListener{
        list.add(Item(i++,txt.text.toString()))
            setupData()
            Log.i("setup",list.count().toString())
        }

    }

    private fun setupData() {
        myAdapter= MyAdapter()
        var recyclerViev = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerViev.adapter = myAdapter
        myAdapter.setItems(list)
    }
}