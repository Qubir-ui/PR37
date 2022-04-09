package com.example.dialogfragments

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

import android.content.Intent



class TestCheckboxDialog: DialogFragment() {
    val choises = arrayOf("Луна и звезды ночью", "Солнце днем")
    val checked= booleanArrayOf(true, true)
    var moon: Boolean? = null
    var sun:Boolean? = null
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            AlertDialog.Builder(it)
                .setMultiChoiceItems(choises, checked){
                        dialog, which, isChecked ->
                    checked[which] = isChecked

                }
                .setPositiveButton("Ok",
                    {dialog, which ->
                        moon = checked[0]
                        sun = checked[1]
                        TestTimePickerDialog(moon!!, sun!!).show(MainActivity.fragManager!!, "TestCheckboxDialog")
                        dialog.dismiss()
                    }
                )

                .create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}