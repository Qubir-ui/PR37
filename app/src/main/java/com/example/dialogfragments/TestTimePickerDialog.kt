package com.example.dialogfragments

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import java.util.*

class TestTimePickerDialog(moon: Boolean, sun: Boolean): DialogFragment() {
    var Sun = sun
    var Moon = moon
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()

        val curHour = c.get(Calendar.HOUR_OF_DAY);
        val curMinute = c.get(Calendar.MINUTE);
        return TimePickerDialog(activity, {
                _, hour, minute ->
            TestFragment.TestFragmentActivity!!.setState(hour, minute, Sun, Moon)
        }, curHour, curMinute, true)
    }
}