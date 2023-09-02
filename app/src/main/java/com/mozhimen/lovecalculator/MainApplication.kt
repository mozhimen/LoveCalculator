package com.mozhimen.lovecalculator

import com.mozhimen.basick.elemk.android.app.bases.BaseApplication
import com.mozhimen.basick.lintk.optin.OptInApiMultiDex_InApplication
import dagger.hilt.android.HiltAndroidApp

/**
 * @ClassName MainApplication
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/9/2 15:17
 * @Version 1.0
 */
@OptIn(OptInApiMultiDex_InApplication::class)
@HiltAndroidApp
class MainApplication : BaseApplication() {
}