package com.example.myapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var noRequestsTextView: TextView
    private lateinit var tabRequestsButton: Button
    private lateinit var tabAcceptedButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        noRequestsTextView = findViewById(R.id.noRequests)
        tabRequestsButton = findViewById(R.id.tabRequests)
        tabAcceptedButton = findViewById(R.id.tabAccepted)

        // Initial view setup
        noRequestsTextView.visibility = View.VISIBLE
        listView.visibility = View.GONE

        tabRequestsButton.setOnClickListener {
            showRequests()
        }

        tabAcceptedButton.setOnClickListener {
            showAccepted()
        }

        // Simulate receiving ride requests
        simulateRideRequests()
    }

    private fun showRequests() {
        // Show the list of ride requests
        noRequestsTextView.visibility = View.GONE
        listView.visibility = View.VISIBLE
    }

    private fun showAccepted() {
        // Show the list of accepted rides
        noRequestsTextView.visibility = View.VISIBLE
        listView.visibility = View.GONE
    }

    private fun simulateRideRequests() {
        // Simulate the presence of ride requests
        // This is where you would normally fetch data from a server
        noRequestsTextView.visibility = View.GONE
        listView.visibility = View.VISIBLE

        // Automate clicking the first request
        listView.performItemClick(listView.getChildAt(0), 0, listView.getItemIdAtPosition(0))
    }
}