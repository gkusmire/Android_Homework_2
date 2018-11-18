package com.daftmobile.a4bhomework2

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showDialog(v: View) {

        val builder = AlertDialog.Builder(v.context)
        builder.setMessage(getString(R.string.alertMessage, (v as Button).text))
            .setPositiveButton(R.string.fireButton){_,_ -> } //tapping button does nothing ;)
            .setNegativeButton(R.string.cancelButton){_, _ ->} //tapping button does nothing ;)

        builder.create()

        builder.show()

    }
}

