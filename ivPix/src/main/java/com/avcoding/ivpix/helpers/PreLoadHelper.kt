package com.avcoding.ivpix.helpers

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.integration.recyclerview.RecyclerViewPreloader
import com.avcoding.ivpix.adapters.MainImageAdapter
import com.avcoding.ivpix.models.Img

internal fun Context.preLoader(adapter: MainImageAdapter): RecyclerViewPreloader<Img> =
    RecyclerViewPreloader(
        Glide.with(this), adapter, adapter.sizeProvider, 30 /*maxPreload*/
    )