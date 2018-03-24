package br.com.renan2junior.peladafc.repositories

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import br.com.renan2junior.peladafc.constants.DataContants

/**
 * Created by renanjunior on 23/03/2018.
 */
class PeladaDataBaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {


    companion object {
        private val DATABASE_NAME : String ="peladafc.dp"
        private val DATABASE_VERSION : Int = 1
    }


    private val createTable = """ CREATE TABLE ${DataContants.TABLE.PLAYER} (
                                    ${DataContants.TABLE.PLAYER.USER_ID} INTEGER PRIMARY KEY AUTOINCREMENT,

                            )"""

    override fun onCreate(db: SQLiteDatabase) {

        db.execSQL(createTable)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }


}