package com.example.layouts_challenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class LoginFragment : Fragment() {

    lateinit var viewlogin : View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewlogin = inflater.inflate(R.layout.fragment_login, container, false)
        return viewlogin
    }

}