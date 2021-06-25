package kg.tutorialapp.home_work_43

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import drawable.BaseVievHolder

class MyViewHolder(itemView:View):BaseVievHolder<Any>(itemView){
    override fun bind(item: Any){
        item as Item
        itemView.run {
            var tv_name = findViewById<TextView>(R.id.tv_name)
            tv_name.text = item.name
        }

    }
    companion object{
        fun create(parent: ViewGroup):MyViewHolder{
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_my_view_holder,parent,false)
            return MyViewHolder(view)
        }
    }
}