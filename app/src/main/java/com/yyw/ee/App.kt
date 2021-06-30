package com.yyw.ee

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * Copyright (C), 2015-2021, 海南双猴科技有限公司
 * @Description: 暂无
 * @Author: Yingyan Wu
 * @CreateDate: 2021/6/30 9:39
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
@HiltAndroidApp
class App : Application() {
    @Inject
    lateinit var test: TestHilt
    override fun onCreate() {
        super.onCreate()
        test.printString()
    }
}