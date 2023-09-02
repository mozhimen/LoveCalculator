package com.mozhimen.lovecalculator.dis

import androidx.lifecycle.ViewModel
import com.mozhimen.lovecalculator.Cache
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * @ClassName MainMidule
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/9/2 15:20
 * @Version 1.0
 */
@Module
@InstallIn(ViewModelComponent::class)
class MainModule {

    @ViewModelScoped
    @Provides
    fun providerCache(): Cache = Cache()
}