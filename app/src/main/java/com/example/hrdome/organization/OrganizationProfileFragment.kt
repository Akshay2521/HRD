package com.example.hrdome.organization

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hrdome.databinding.FragmentOrganizationProfileBinding


/**
 * A simple [Fragment] subclass.
 * Use the [OrganizationProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OrganizationProfileFragment : Fragment() {
    private lateinit var binding: FragmentOrganizationProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = FragmentOrganizationProfileBinding.inflate(layoutInflater).also { binding = it }.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }



}

