package com.example.navigationissue

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class SimpleDetailsFragment : Fragment(R.layout.fragment_simple_details) {
    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        view.findViewById<View>(R.id.open).setOnClickListener {
            findNavController().popBackStack()
        }
    }
}
