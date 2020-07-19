package com.app.kotlinexpandable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val header : MutableList<String> = ArrayList()
    val body : MutableList<MutableList<String>> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val season1 : MutableList<String> = ArrayList()
        season1.add("Winter is Coming")
        season1.add("Winter is Coming2")
        season1.add("Winter is Coming3")
        season1.add("Winter is Coming4")
        season1.add("Winter is Coming5")
        season1.add("Winter is Coming6")

        val topic1 : MutableList<String> = ArrayList()
        topic1.add("Topic 1")
        topic1.add("Topic 3")
        topic1.add("Topic 3")

        val season2 : MutableList<String> = ArrayList()
        season2.add("the north remembers")
        season2.add("the north remembers2")
        season2.add("the north remembers3")
        season2.add("the north remembers4")
        season2.add("the north remembers5")
        season2.add("the north remembers6")

        val season3 : MutableList<String> = ArrayList()
        season3.add("The Night Lands")
        season3.add("The Night Lands2")
        season3.add("The Night Lands3")
        season3.add("The Night Lands4")
        season3.add("The Night Lands5")
        season3.add("The Night Lands6")

        header.add("Season 1")
        header.add("Season 2")
        header.add("Season 3")

        body.add(season1)
        body.add(season2)
        body.add(season3)

        expLv.setAdapter(ExpandableListViewAdapter(this,header,body))
    }
}

