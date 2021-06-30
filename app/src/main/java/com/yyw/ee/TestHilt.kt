package com.yyw.ee

import android.util.Log
import javax.inject.Inject

/**
 * Copyright (C), 2015-2021, 海南双猴科技有限公司
 * @Description: 暂无
 * @Author: Yingyan Wu
 * @CreateDate: 2021/6/30 9:42
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
private const val TAG="TestHilt"
class TestHilt @Inject constructor() {
    fun printString(){
        Log.d(TAG,"I was a good person.")
    }
}