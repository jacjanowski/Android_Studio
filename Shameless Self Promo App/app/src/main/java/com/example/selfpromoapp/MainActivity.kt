package com.example.selfpromoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_preview.setOnClickListener {
            onPreviewClicked()
        }

        val spinnerValues = arrayOf("Android Developer", "Android Engineer")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,spinnerValues)
        spinner_job_title.adapter = spinnerAdapter
    }

    private fun onPreviewClicked() {
//        Log.d("This is my TAG", "currently, contactNameEditText is " + contactNameEditText.toString())
//        val contactName = edit_text_contact_name.text.toString()
//        val contactNumber = edit_text_contact_number.text.toString()
//        val myDisplayName = edit_text_my_display_name.text.toString()
//        val includeJunior = check_box_junior.text.toString()
//        val jobTitle = spinner_job_title.selectedItem?.toString()
//        val immediateStart = check_box_immediate_start.isChecked
//        val startDate = edit_text_start_date.text.toString()


//        val testString = "Contact Name: $contactName, Contact Number: $contactNumber, My Display Name: $myDisplayName, Include Junior: $includeJunior, Job Title: $jobTitle, Immediate Start: $immediateStart, Start Date: $startDate"
//
//        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()

        val message = Message(
            edit_text_contact_name.text.toString(),
            edit_text_contact_number.text.toString(),
            edit_text_my_display_name.text.toString(),
            check_box_junior.isChecked,
            spinner_job_title.selectedItem?.toString(),
            check_box_immediate_start.isChecked,
            edit_text_start_date.text.toString()
        )

        val previewActivityIntent = Intent(this,PreviewActivity::class.java)
        previewActivityIntent.putExtra("Message", message)

        startActivity(previewActivityIntent)
//        previewActivityIntent.putExtra("Contact Name", contactName)
//        previewActivityIntent.putExtra("Contact Number", contactNumber)
//        previewActivityIntent.putExtra("My Display Name", myDisplayName)
//        previewActivityIntent.putExtra("Include Junior", includeJunior)
//        previewActivityIntent.putExtra("Job Title", jobTitle)
//        previewActivityIntent.putExtra("Immediate Start", immediateStart)
//        previewActivityIntent.putExtra("Start Date", startDate)




    }
}