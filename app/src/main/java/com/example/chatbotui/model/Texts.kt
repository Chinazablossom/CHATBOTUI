package com.example.chatbotui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Texts(@DrawableRes val image:Int, @StringRes val userName:Int, val text:String)
