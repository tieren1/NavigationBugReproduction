package com.example.navigationissue

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class StartFragment : Fragment(R.layout.fragment_start) {
    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        view.findViewById<View>(R.id.open).setOnClickListener {
            // val action = StartFragmentDirections.actionStartFragmentToNavigationSecond()
            // findNavController().navigate(action)

            val navOptions: NavOptions = navOptions {
                popUpTo(R.id.navigation_start) {
                    inclusive = true
                }
                launchSingleTop = true
            }

            findNavController().navigate(
                resId = R.id.navigation_simple,
                args = null,
                navOptions = navOptions,
            )
        }
    }
}
