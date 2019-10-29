package com.run.profile

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myNameButton.setOnClickListener {

            myNameButton.setBackgroundColor(Color.parseColor("#29abe2"))
            mySportButton.setBackgroundColor(Color.parseColor("#929292"))
            myFoodButton.setBackgroundColor(Color.parseColor("#929292"))
            myHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            myImageView.setImageResource(R.drawable.tobisuke)
            myText.text = "とびすけ"
        }

        mySportButton.setOnClickListener {

            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            mySportButton.setBackgroundColor(Color.parseColor("#29abe2"))
            myFoodButton.setBackgroundColor(Color.parseColor("#929292"))
            myHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            myImageView.setImageResource(R.drawable.soccer)
            myText.text = "サッカー"
        }

        myFoodButton.setOnClickListener {

            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            mySportButton.setBackgroundColor(Color.parseColor("#929292"))
            myFoodButton.setBackgroundColor(Color.parseColor("#29abe2"))
            myHobbyButton.setBackgroundColor(Color.parseColor("#929292"))
            myImageView.setImageResource(R.drawable.sushi)
            myText.text = "すし"
        }

        myHobbyButton.setOnClickListener {

            myNameButton.setBackgroundColor(Color.parseColor("#929292"))
            mySportButton.setBackgroundColor(Color.parseColor("#929292"))
            myFoodButton.setBackgroundColor(Color.parseColor("#929292"))
            myHobbyButton.setBackgroundColor(Color.parseColor("#29abe2"))
            myImageView.setImageResource(R.drawable.dance)
            myText.text = "ダンス"
        }

//        //画像と名前をかくす
//        myImageView.visibility = View.INVISIBLE
//        myText.visibility = View.INVISIBLE
//
//        myNameButton.setOnClickListener {
//
//            myImageView.visibility = View.VISIBLE
//            myText.visibility = View.VISIBLE
//        }
    }
}
