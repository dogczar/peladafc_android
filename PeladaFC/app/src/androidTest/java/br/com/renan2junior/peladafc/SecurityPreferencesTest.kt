package br.com.renan2junior.peladafc

import android.content.Context
import android.support.test.InstrumentationRegistry
import br.com.renan2junior.peladafc.constants.DataContants
import br.com.renan2junior.peladafc.util.SecurityPreferences
import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * Created by renanjunior on 23/03/18.
 */
class SecurityPreferencesTest {


    lateinit var appContext : Context
    lateinit var mSecurityPreferences : SecurityPreferences

    fun populateStoredString(){
        mSecurityPreferences.storedString("renan2junior@gmail.com","100297")
    }

    @Before fun getContext(){
        appContext = InstrumentationRegistry.getContext()
        mSecurityPreferences = SecurityPreferences(appContext)

    }

    @Test fun storedStringTest(){
        populateStoredString()
        Assert.assertTrue(mSecurityPreferences.storedString("renan2junior@gmail.com","100297"))
    }


    @Test fun getStoredStringTest()
    {
        populateStoredString()
        Assert.assertEquals("renan2junior@gmail.com", mSecurityPreferences.getStoredString(DataContants.TABLE.PLAYER.EMAIL))
    }

    @Test fun removeStoredStringTest(){
        Assert.assertTrue(mSecurityPreferences.removeStoredStrin(DataContants.TABLE.PLAYER.NAME))
    }



}