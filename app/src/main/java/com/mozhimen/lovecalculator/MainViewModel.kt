package com.mozhimen.lovecalculator

import androidx.lifecycle.MutableLiveData
import com.mozhimen.basick.elemk.androidx.lifecycle.bases.BaseViewModel
import com.mozhimen.basick.elemk.kotlin.properties.VarProperty_Set
import dagger.hilt.android.lifecycle.HiltViewModel
import java.math.BigDecimal
import javax.inject.Inject

/**
 * @ClassName MainViewModel
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/9/2 14:31
 * @Version 1.0
 */
@HiltViewModel
class MainViewModel @Inject constructor(private val _cache: Cache) : BaseViewModel() {
    var number_gege by VarProperty_Set(_cache.number_gege) { field, value ->
        lv_number_gege.value = value.toString()
        _cache.number_gege = value
        true
    }
    var number_meimei by VarProperty_Set(_cache.number_meimei) { field, value ->
        lv_number_meimei.value = value.toString()
        _cache.number_meimei = value
        true
    }
    val lv_number_gege = MutableLiveData(_cache.number_gege.toString())
    val lv_number_meimei = MutableLiveData(_cache.number_meimei.toString())

    fun add_gege(other: Double) {
        number_gege = number_gege.toBigDecimal().add(BigDecimal(other)).toDouble()
    }

    fun minus_gege(other: Double) {
        number_gege = number_gege.toBigDecimal().minus(BigDecimal(other)).toDouble()
    }

    fun add_meimei(other: Double) {
        number_meimei = number_meimei.toBigDecimal().add(BigDecimal(other)).toDouble()
    }

    fun minus_meimei(other: Double) {
        number_meimei = number_meimei.toBigDecimal().minus(BigDecimal(other)).toDouble()
    }
}