package com.avcoding.ivpix.utility

import android.view.MotionEvent
import androidx.recyclerview.widget.RecyclerView
import com.avcoding.ivpix.databinding.FragmentPixBinding

class CustomItemTouchListener(private val binding: PixBindings) :
    RecyclerView.OnItemTouchListener {
    override fun onInterceptTouchEvent(rv: RecyclerView, e: MotionEvent): Boolean {
        val action = e.action
        return if (binding.gridLayout.instantRecyclerView.canScrollHorizontally(RecyclerView.FOCUS_FORWARD)) {
            when (action) {
                MotionEvent.ACTION_MOVE -> binding.fragmentPix.root.requestDisallowInterceptTouchEvent(true)
            }
            false
        } else {
            when (action) {
                MotionEvent.ACTION_MOVE -> binding.fragmentPix.root.requestDisallowInterceptTouchEvent(false)
            }
            binding.gridLayout.instantRecyclerView.removeOnItemTouchListener(this)
            true
        }
    }

    override fun onTouchEvent(rv: RecyclerView, e: MotionEvent) {}
    override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {}
}