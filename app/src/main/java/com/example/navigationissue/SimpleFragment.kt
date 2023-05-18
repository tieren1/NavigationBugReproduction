package com.example.navigationissue

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SimpleFragment : Fragment(R.layout.fragment_simple) {
    private var popBack = false

    override fun onResume() {
        super.onResume()
        Log.d("SimpleFragment", "onResume")
    }
    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        Log.d("SimpleFragment", "onViewCreated")

        view.findViewById<View>(R.id.openByAction).setOnClickListener {
            val action = SimpleFragmentDirections.actionSimpleFragmentToSimpleDetailsFragment()
            findNavController().navigate(action)
        }

        view.findViewById<View>(R.id.openByResId).setOnClickListener {
            navigateToSecondFragmentByResId()
        }
    }

    private fun navigateToSecondFragmentByResId() {
        findNavController().navigate(
            resId = R.id.simpleDetailsFragment,
            args = null,
        )
    }
}
