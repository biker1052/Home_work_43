package drawable

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseVievHolder<T>(itemView: View):RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item:T)
}