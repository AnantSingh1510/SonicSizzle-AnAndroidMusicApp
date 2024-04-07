package com.musicapp.sonicsizzle.Models

data class CategoryModel(
    val name : String,
    val coverUrl : String,
    val songs : List<String>
){
    constructor(): this("", "", emptyList())
}