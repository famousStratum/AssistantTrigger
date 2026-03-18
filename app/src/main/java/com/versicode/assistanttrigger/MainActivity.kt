package com.versicode.assistanttrigger

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val voiceIntent = Intent(Intent.ACTION_VOICE_COMMAND)


        try {
            startActivity(voiceIntent)
        } catch (_: ActivityNotFoundException) {
            Toast.makeText(this, "Voice Assistant not found", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            finish()
        }
    }
}
