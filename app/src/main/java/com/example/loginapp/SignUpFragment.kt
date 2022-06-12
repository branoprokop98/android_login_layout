package com.example.loginapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class SignUpFragment : Fragment() {

    private lateinit var viewOfLayout: View
    private lateinit var signupBtn: Button
    private lateinit var emailText: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewOfLayout = inflater.inflate(R.layout.sign_up_tab_fragment, container, false)

        signupBtn = viewOfLayout.findViewById<Button>(R.id.signup_btn)
        emailText = viewOfLayout.findViewById<EditText>(R.id.email_sign)
        signupBtn.setOnClickListener { view ->
            Log.d("btnSetup", emailText.text.toString())
        }

        return viewOfLayout
    }
}
