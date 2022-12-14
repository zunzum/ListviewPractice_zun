package com.zunzum.listviewpractice_zun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zunzum.listviewpractice_zun.adapters.StudentAdapter
import com.zunzum.listviewpractice_zun.da.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mStudentlist = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentlist.add( Student("가가가", 1987))
        mStudentlist.add( Student("리리리", 1957))
        mStudentlist.add( Student("부부부", 1996))
        mStudentlist.add( Student("술술술", 1994))
        mStudentlist.add( Student("허허허", 1957))
        mStudentlist.add( Student("김김김", 1988))

        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentlist)

        studentListView.adapter = mAdapter
        
        studentListView.setOnItemClickListener { adapterView, view, position, id ->

            val clickedStudent = mStudentlist[position]

            Toast.makeText(this, "${clickedStudent.name} 클릭", Toast.LENGTH_SHORT).show()

        }

        studentListView.setOnItemLongClickListener { adapterView, view, position, id ->
            mStudentlist.removeAt(position)
            mAdapter.notifyDataSetChanged()
            /*
            val longClickedStudent = mStudentlist[position]
            Toast.makeText(this, "${longClickedStudent.name} 길게 클릭됨", Toast.LENGTH_SHORT).show()
            */
            return@setOnItemLongClickListener true
        }
    }
}