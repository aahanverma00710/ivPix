package com.avcoding.ivpix.helpers

import android.view.animation.AccelerateDecelerateInterpolator
import com.avcoding.ivpix.databinding.FragmentPixBinding
import com.avcoding.ivpix.utility.PixBindings


fun PixBindings.videoRecordingStartAnim() {
    val adInterpolator = AccelerateDecelerateInterpolator()
    controlsLayout.primaryClickButton.animate().apply {
        scaleX(1.2f)
        scaleY(1.2f)
        duration = 300
        interpolator = adInterpolator
    }.start()
    controlsLayout.flashButton.animate().apply {
        alpha(0f)
        duration = 300
        interpolator = adInterpolator
    }.start()
    controlsLayout.messageBottom.animate().apply {
        alpha(0f)
        duration = 300
        interpolator = adInterpolator
    }.start()
    controlsLayout.lensFacing.animate().apply {
        alpha(0f)
        duration = 300
        interpolator = adInterpolator
    }.start()
}

fun PixBindings.videoRecordingEndAnim() {
    val adInterpolator = AccelerateDecelerateInterpolator()
    controlsLayout.primaryClickButton.animate().apply {
        scaleX(1f)
        scaleY(1f)
        duration = 300
        interpolator = adInterpolator
    }.start()
    controlsLayout.flashButton.animate().apply {
        alpha(1f)
        duration = 300
        interpolator = adInterpolator
    }.start()
    controlsLayout.messageBottom.animate().apply {
        scaleX(1f)
        scaleY(1f)
        duration = 300
        interpolator = adInterpolator
    }.start()
    controlsLayout.lensFacing.animate().apply {
        alpha(1f)
        duration = 300
        interpolator = adInterpolator
    }.start()
}
