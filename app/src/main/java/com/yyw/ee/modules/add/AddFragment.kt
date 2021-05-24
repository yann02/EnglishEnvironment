package com.yyw.ee.modules.add

import androidx.navigation.fragment.findNavController
import com.yyw.ee.R
import com.yyw.ee.databinding.FragmentAddBinding
import com.yyw.ee.mvvm.view.BaseFragment

class AddFragment : BaseFragment<AddViewModel, FragmentAddBinding>() {
    override fun getLayoutId() = R.layout.fragment_add
    override fun initView() {
        super.initView()
        mDataBinding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}