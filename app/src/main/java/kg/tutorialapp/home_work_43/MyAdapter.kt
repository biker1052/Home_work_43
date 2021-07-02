package kg.tutorialapp.home_work_43



import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.tutorialapp.home_work_43.MyAdapter.Type.ITEM

class MyAdapter:RecyclerView.Adapter<BaseVievHolder<Any>>() {
    private val items = arrayListOf<Any>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseVievHolder<Any> {
        return MyViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: BaseVievHolder<Any>, position: Int) {
        holder.bind(items[position])

    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun getItemViewType(position: Int): Int {
        return when(items[position]){
            is Item-> ITEM
            else -> -1
        }
    }
    fun setItems(newItems:List<Any>){
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }
    object Type{
        const val ITEM = 0
    }
    companion object{
        const val tag = "ADAPTER"
    }
}