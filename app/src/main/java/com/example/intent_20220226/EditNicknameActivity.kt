package com.example.intent_20220226

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        btnSave.setOnClickListener {
            val inputNickname = btnedtNickname.text.toString()

            val resultIntent = Intent() //출발지 도착지 명시X
            resultIntent.putExtra("nick",inputNickname)

            setResult(RESULT_OK,resultIntent)

            finish()
        }


    }
}