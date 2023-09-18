package com.avcoding.imagevideopicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.avcoding.ivpix.helpers.PixEventCallback
import com.avcoding.ivpix.helpers.addPixToActivity
import com.avcoding.ivpix.models.Flash
import com.avcoding.ivpix.models.Mode
import com.avcoding.ivpix.models.Options
import com.avcoding.ivpix.models.Ratio
import com.avcoding.ivpix.models.VideoOptions
import java.io.File


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val optionsVideos = VideoOptions().apply {
            videoDurationLimitInSeconds = 30
        }
        val dir = File(cacheDir.path, "Pix/Camera")
        val options = Options().apply {
            ratio = Ratio.RATIO_AUTO
            count = 1
            spanCount = 4
            path = dir.path
            isFrontFacing = true
            mode = Mode.All
            flash = Flash.Auto
            videoOptions = optionsVideos
        }
        addPixToActivity(R.id.flConatier, options) {
            when (it.status) {
                PixEventCallback.Status.SUCCESS -> {
                    if (it.data.isNotEmpty()) {
                        val imageURi = it.data[0]
                        //selectedImages.add(imageURi)
                        // setUpCImagesViews(imageURi)
                    }
                }

                PixEventCallback.Status.BACK_PRESSED -> {
                    finish()
                }
            }

        }
    }
}