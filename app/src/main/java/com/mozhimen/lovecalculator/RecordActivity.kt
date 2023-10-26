package com.mozhimen.lovecalculator

import androidx.activity.viewModels
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.mozhimen.componentk.pagingk.bases.BasePagingKActivityVBVM
import com.mozhimen.lovecalculator.databinding.ActivityRecordBinding
import com.mozhimen.lovecalculator.db.Record

/**
 * @ClassName RecordActivity
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/10/22 23:53
 * @Version 1.0
 */
class RecordActivity : BasePagingKActivityVBVM<Record, ActivityRecordBinding, RecordViewModel>() {
    private val _vm :RecordViewModel by viewModels()

    private val _adapter by lazy { RecordAdapter() }

    override fun getViewModel(): RecordViewModel {
        return _vm
    }

    override fun getPagedListAdapter(): PagedListAdapter<Record, *> {
        return _adapter
    }

    override fun getSwipeRefreshLayout(): SwipeRefreshLayout {
        return vb.recordSwipe
    }

    override fun getRecyclerView(): RecyclerView {
        return vb.recordRecycler
    }

    override fun getRecyclerViewLayoutManager(): RecyclerView.LayoutManager {
        return LinearLayoutManager(this)
    }

    override fun onLoadStart() {

    }

    override fun onLoadEmpty() {

    }

    override fun onLoadComplete() {

    }
}