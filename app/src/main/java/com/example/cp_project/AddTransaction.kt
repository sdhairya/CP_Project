package com.example.cp_project

import android.R.attr
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.R.attr.startYear
import android.annotation.SuppressLint

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.Dialog
import android.app.PendingIntent.getActivity
import android.widget.EditText
import androidx.annotation.Nullable
import java.util.*
import javax.xml.datatype.DatatypeConstants
import javax.xml.datatype.DatatypeConstants.MONTHS


class AddTransaction : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_transaction)

        val date_pick=findViewById<ImageButton>(R.id.datepicker)
        val txt_date=findViewById<EditText>(R.id.date)

        date_pick.setOnClickListener {

            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)


            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                // Display Selected date in textbox
                val m=monthOfYear+1
                txt_date.setText("" + dayOfMonth + " " + m+ ", " + year)

            }, year, month, day)

            dpd.show()

        }

    }
    private operator fun DatatypeConstants.Field.get(monthOfYear: Int) {

    }

}


