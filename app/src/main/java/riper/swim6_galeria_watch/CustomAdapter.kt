package riper.swim6_galeria_watch

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import kotlinx.android.synthetic.main.item_layout.view.*

class CustomAdapter(val activity: Activity) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

	class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		var image: ImageView

		init {
			image = itemView.image
		}
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
		val context = parent.context
		val view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)// as View
		return ViewHolder(view)
	}

	override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
		viewHolder.image.setImageResource(Data.data[position])
	}

	override fun getItemCount(): Int {
		return Data.data.size
	}

}
