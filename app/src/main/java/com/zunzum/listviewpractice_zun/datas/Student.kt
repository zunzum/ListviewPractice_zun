package com.zunzum.listviewpractice_zun.da

import android.util.Log
import kotlin.math.log

// 학생 하위정보 - 이름, 출생년도
class Student(
    val name : String,
    val birthYear : Int) {
    //2022년 나의 나이를 결과로 내보내는 함수
    fun getMyAgeIn2022() : Int {
        val myAge = 2022 - this.birthYear + 1

        return myAge
    }

//
//    //학생의 기능? 예시
//    // 자신의 이름을 로그로 찍는 기능
//
//    fun printMyNameToLog(num1 : Int, num2 : Double) : Boolean{
//        //num1이 num2보다 크다면 로그이름만, 아니면 이름과 인사도 로그 출력
//        if (num1>num2) {
//            Log.d("연습용", this.name)
//        }
//        else {
//            Log.d("연습용", this.name)
//            Log.d("연습용", "잘부탁드립니다")
//        }
//        return true
//    }
}