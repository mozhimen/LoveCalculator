package com.mozhimen.lovecalculator

import android.os.Bundle
import com.mozhimen.basick.elemk.androidx.appcompat.bases.BaseActivityVBVM
import com.mozhimen.basick.utilk.android.content.startContext
import com.mozhimen.lovecalculator.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivityVBVM<ActivityMainBinding, MainViewModel>() {

    override fun initView(savedInstanceState: Bundle?) {
        vb.mainBtnRecord.setOnClickListener{
            startContext<RecordActivity>()
        }
    }
    override fun bindViewVM(vb: ActivityMainBinding) {
        vb.vm = vm
    }
}