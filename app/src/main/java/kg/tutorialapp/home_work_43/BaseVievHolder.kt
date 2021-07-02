package kg.tutorialapp.home_work_43

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseVievHolder<T>(itemView: View):RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item:T)
}