package com.example.sho_sakai.kotlinlog
import android.util.Log

open class Human: Animal, Thinkable {
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age){

        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)")
    }

    override fun think() {
        Log.d("kotlintest", this.name + "(" + this.hobby + "歳)")
    }
}
