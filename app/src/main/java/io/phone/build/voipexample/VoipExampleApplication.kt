package io.phone.build.voipexample

import android.app.Application
import android.util.Log
import androidx.preference.PreferenceManager
import io.phone.build.voipexample.ui.call.IncomingCallActivity
import io.phone.build.voipexample.ui.call.CallActivity
import io.phone.build.voipsdkandroid.configuration.ApplicationSetup
import io.phone.build.voipsdkandroid.configuration.AuthAssistant
import io.phone.build.voipsdkandroid.startAndroidPIL

class VoipExampleApplication : Application() {
    private val prefs by lazy {
        PreferenceManager.getDefaultSharedPreferences(this)
    }

    override fun onCreate() {
        super.onCreate()

        startAndroidPIL {
            preferences = preferences.copy(
                useApplicationProvidedRingtone = prefs.getBoolean(
                    "use_application_provided_ringtone",
                    false
                )
            )

            ApplicationSetup(
                application = this@VoipExampleApplication,
                activities = ApplicationSetup.Activities(
                    call = CallActivity::class.java,
                    incomingCall = IncomingCallActivity::class.java
                ),
                middleware = null,
                logger = { message, _ -> Log.i("PIL-Logger", message) },
                userAgent = "Android SDK Kotlin 1.8.0",
                notifyOnMissedCall = true,
                onMissedCallNotificationPressed = null
            )
        }
    }
}