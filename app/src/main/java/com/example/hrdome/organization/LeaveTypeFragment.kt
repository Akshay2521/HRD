package com.example.hrdome.organization

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hrdome.databinding.FragmentLeaveTypeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [LeaveTypeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LeaveTypeFragment : Fragment() {


    private lateinit var binding: FragmentLeaveTypeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = FragmentLeaveTypeBinding.inflate(layoutInflater).also { binding = it }.root


}