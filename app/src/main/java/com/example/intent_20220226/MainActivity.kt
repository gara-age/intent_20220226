package com.example.intent_20220226

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    멤버변수 : 코드 초반부 첫번쩨 { 에서 바로 만드는 변수
    val REQ_CODE_NICKNAME = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMoveToOther.setOnClickListener {

        val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

        btnSendMessage.setOnClickListener {

            val inputMessage = edtMessage.text.toString()


//            ViewMessageActivity 화면으로 이동 + 입력한 메세지 첨부

            val myIntent = Intent(this,ViewMessageActivity::class.java)

            myIntent.putExtra("메세지",inputMessage)
            startActivity(myIntent)


        }

        btnEditNickname.setOnClickListener {
            val myIntent = Intent(this,EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQ_CODE_NICKNAME) // 1000 번은 닉네임을 변경하러 간다는 의미로 사용


        }
    }
}