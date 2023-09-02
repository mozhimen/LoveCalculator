package com.mozhimen.lovecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mozhimen.basick.elemk.androidx.appcompat.bases.BaseActivityVBVM
import com.mozhimen.lovecalculator.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivityVBVM<ActivityMainBinding, MainViewModel>() {

    override fun bindViewVM(vb: ActivityMainBinding) {
        vb.vm = vm
    }
}