package com.mozhimen.lovecalculator

import com.mozhimen.basick.cachek.datastore.helpers.CacheKDSProvider
import com.mozhimen.basick.cachek.datastore.temps.CacheKDSVarPropertyDouble

/**
 * @ClassName Cache
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/9/2 14:48
 * @Version 1.0
 */
class Cache {
    private val _provider by lazy { CacheKDSProvider("ds_love_calculator") }

    var number_gege by CacheKDSVarPropertyDouble(_provider,"number_gege")
    var number_meimei by CacheKDSVarPropertyDouble(_provider,"number_meimei")
}