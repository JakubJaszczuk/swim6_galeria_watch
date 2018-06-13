package riper.swim6_galeria_watch

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.LinearSnapHelper
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : WearableActivity() {

	private lateinit var recyclerView: RecyclerView
	private val adapter: RecyclerView.Adapter<*> = CustomAdapter(this)

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// Enables Always-on
		setAmbientEnabled()
		initRecyclerView()
	}

	private fun initRecyclerView() {
		recyclerView = recyclerView1
		recyclerView.setHasFixedSize(true)
		recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
		recyclerView.adapter = adapter
		val snap = LinearSnapHelper()
		snap.attachToRecyclerView(recyclerView)
	}
}
