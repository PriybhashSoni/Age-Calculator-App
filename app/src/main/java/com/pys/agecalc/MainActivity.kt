package com.pys.agecalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var button= findViewById<Button>(R.id.button)
           button.setOnClickListener{view->
               clickDatePickerView(view)
               Toast.makeText(this,"its a toast",Toast.LENGTH_LONG).show()
           }
    }

    
     fun clickDatePickerView(view:View) {
      val myCalendar=Calendar.getInstance()
         val year=myCalendar.get(Calendar.YEAR)
         val month=myCalendar.get(Calendar.MONTH)
         val date=myCalendar.get(Calendar.DAY_OF_MONTH)
         DatePickerDialog(this,
             DatePickerDialog.OnDateSetListener{view,year,month,dayOfMonth->}
             ,year,month,date).show()
    }
}