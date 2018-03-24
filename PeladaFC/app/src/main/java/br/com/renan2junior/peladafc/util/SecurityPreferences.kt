package br.com.renan2junior.peladafc.util

import android.content.Context
import android.content.SharedPreferences
import br.com.renan2junior.peladafc.constants.DataContants

/**
 * Created by renanjunior on 23/03/18.
 */
class SecurityPreferences(context: Context) {


    val mSharedPreferences: SharedPreferences = context.getSharedPreferences("peladafc", Context.MODE_PRIVATE)


    fun storedString(email: String, password: String): Boolean {
        try {
            mSharedPreferences.edit().putString(DataContants.TABLE.PLAYER.PASSWORD, password).apply()
            mSharedPreferences.edit().putString(DataContants.TABLE.PLAYER.EMAIL, email).apply()
        } catch (e: Exception) {
            return false
        }
        return true
    }

    fun getStoredString(key: String): String {
        return mSharedPreferences.getString(key, "").toString()
    }

    fun removeStoredStrin(key: String):Boolean{
        try {
            mSharedPreferences.edit().remove(key).apply().hashCode()
            return true
        }catch (e:Exception){
            return false
        }
    }
}