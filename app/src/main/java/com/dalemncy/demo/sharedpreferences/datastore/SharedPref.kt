package com.dalemncy.demo.sharedpreferences.datastore

import android.content.Context
import com.dalemncy.demo.sharedpreferences.constants.Constants

class SharedPref(context: Context) {

    private val sharedPref = context
        .getSharedPreferences(Constants.GENERAL, Context.MODE_PRIVATE)

    var title: String?
        set(title: String?) = sharedPref.edit()
            .putString(Constants.PARAM_TITLE, title).apply()
        get() = sharedPref
            .getString(Constants.PARAM_TITLE, "")
}