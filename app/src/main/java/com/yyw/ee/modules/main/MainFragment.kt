package com.yyw.ee.modules.main

import androidx.navigation.fragment.findNavController
import com.yyw.ee.MainViewModel
import com.yyw.ee.R
import com.yyw.ee.databinding.FragmentMainBinding
import com.yyw.ee.mvvm.view.BaseFragment
import dagger.hilt.android.scopes.FragmentScoped

class MainFragment : BaseFragment<MainViewModel, FragmentMainBinding>() {

    override fun getLayoutId() = R.layout.fragment_main

    override fun initView() {
        super.initView()
        mDataBinding.btnAdd.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_addFragment)
        }
    }
}