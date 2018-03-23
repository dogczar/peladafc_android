package br.com.renan2junior.peladafc.util

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by renanjunior on 23/03/18.
 */
class SecurityPreferences (context: Context)  {


    val mSharedPreferences : SharedPreferences = context.getSharedPreferences("peladafc", Context.MODE_PRIVATE)


    fun storedString(email: String, password: String): Boolean {

        mSharedPreferences.edit().putString("", email ).apply()
        mSharedPreferences.edit().putString("", password ).apply()

        return true
    }
}