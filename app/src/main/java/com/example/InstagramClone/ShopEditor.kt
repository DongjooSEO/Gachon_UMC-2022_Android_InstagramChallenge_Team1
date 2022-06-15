package com.example.InstagramClone

data class ShopEditor(
    val title:String,
    val titleImg:Int?,
    val user:String,
    val userImg:Int?,
    val count:String,
    val subTitle:String,
    val subcontent: ArrayList<ShopEditorSubContent>
)
