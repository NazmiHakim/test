package com.example.listcompose

data class Item(
    val id: Int,
    val title: String,
    val author: String,
    val info1: String,
    val info2: String,
    val imageResId: Int,
    val url: String
)

object ItemData {
    val items = listOf(
        Item(0, "Lookism", "PTJ", "Action, Fighting, Comedy, Romance", "Status: OnGoing", R.drawable.lookism, "https://lookism.fandom.com/wiki/Lookism"),
        Item(1, "Bones", "This, Picture: Mu Mu-min", "Action, Fighting", "Status: OnGoing", R.drawable.bones, "https://en.namu.wiki/w/%EB%B3%B8%EC%A6%88(%EC%9B%B9%ED%88%B0)"),
        Item(2, "WEE!!!", "Amoeba UwU", "Slice of Life, Romance", "OnGoing", R.drawable.wee, "https://webtoon.fandom.com/id/wiki/WEE!!!"),
        Item(3, "Hero Has Returned", "FUNGBACK", "Action, Fighting, Fantasy", "OnGoing", R.drawable.herohasreturned, "https://hero-has-returned.fandom.com/wiki/Hero_Has_Returned_Wiki"),
        Item(4, "Study Group", "Blue String", "Action, Fighting, Comedy", "OnGoing", R.drawable.studygroup, "https://study-group.fandom.com/wiki/Study_Group_Wiki")
    )
}