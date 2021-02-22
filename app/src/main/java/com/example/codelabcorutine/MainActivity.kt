package com.example.codelabcorutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** 코루틴 종류별로 정리하기 **/
        GlobalScope.launch { // 백그라운드에서 시작하는 코루틴
            delay(1000L) // delay for 1 second (default time unit is ms)
            // 논블로킹은 자신이 호출되었을 때 제어권을 바로 자신을 호출한 쪽으로 넘기며, 자신을 호출한 쪽에서 다른 일을 할 수 있도록 하는 것을 의미합니다.
            Log.d("로그", "World") // print after delay
        }
        Log.d("로그", "Hello") // 코투린티 지연되는동안 메인스레드는 계속됨.
    }
}