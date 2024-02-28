package com.example.hrdome.Employees

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hrdome.R


/**
 * A simple [Fragment] subclass.
 * Use the [LeaveBalanceFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LeaveBalanceFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_leave_balance, container, false)
    }

 }