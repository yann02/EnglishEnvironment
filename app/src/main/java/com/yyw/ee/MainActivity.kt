package com.yyw.ee

import android.view.MenuItem
import com.yyw.ee.databinding.ActivityMainBinding
import com.yyw.ee.mvvm.view.BaseActivity

class MainActivity : BaseActivity<MainViewModel,ActivityMainBinding>() {
    override fun getLayoutId()=R.layout.activity_main

    override fun initView() {
        super.initView()
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            super.getOnBackPressedDispatcher()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}