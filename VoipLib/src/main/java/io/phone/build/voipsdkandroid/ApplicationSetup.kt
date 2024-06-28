package io.phone.build.voipsdkandroid

import android.app.Application
import android.content.pm.PackageManager
import android.util.Log
import io.phone.build.voipsdkandroid.configuration.ApplicationSetup

class ApplicationSetup {
    /*override fun onCreate() {
        super.onCreate()

        val callActivity = getMetaData("io.phone.build.voipsdkandroid.CALL_ACTIVITY")
        val incomingCallActivity = getMetaData("io.phone.build.voipsdkandroid.INCOMING_CALL_ACTIVITY")

        if (callActivity != null && incomingCallActivity != null) {
            startAndroidPIL(callActivity, incomingCallActivity)
        } else {
            throw IllegalStateException("Both CALL_ACTIVITY and INCOMING_CALL_ACTIVITY must be defined in the manifest")
        }
    }

    private fun getMetaData(name: String): String? {
        val packageManager = packageManager
        val appInfo = packageManager.getApplicationInfo(packageName, PackageManager.GET_META_DATA)
        return appInfo.metaData.getString(name)
    }

    private fun startAndroidPIL(callActivity: String, incomingCallActivity: String) {
        try {
            val callActivityClass = Class.forName(callActivity) as Class<*>
            val incomingCallActivityClass = Class.forName(incomingCallActivity) as Class<*>

            startAndroidPIL {

                ApplicationSetup(
                    application = this@ApplicationSetup,
                    activities = ApplicationSetup.Activities(
                        call = callActivityClass,
                        incomingCall = incomingCallActivityClass
                    ),
                    middleware = null,
                    logger = { message, _ -> Log.i("PIL-Logger", message) },
                    userAgent = "Android SDK Kotlin 1.8.0",
                    notifyOnMissedCall = true,
                    onMissedCallNotificationPressed = null
                )
            }
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
            throw IllegalStateException("Provided activity classes are not found", e)
        }
    }*/
}