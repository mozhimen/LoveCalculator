package com.mozhimen.lovecalculator

import android.util.Log
import com.mozhimen.componentk.pagingk.bases.BasePagingKRep
import com.mozhimen.componentk.pagingk.bases.BasePagingKViewModel
import com.mozhimen.lovecalculator.db.Record
import com.mozhimen.lovecalculator.db.RecordDatabase

/**
 * @ClassName RecordViewModel
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/10/26 23:00
 * @Version 1.0
 */
class RecordViewModel: BasePagingKViewModel<Record, Record>() {
    override suspend fun onLoadInitial(firstPage: Int, pageSize: Int): BasePagingKRep<Record> {
        val res = RecordDatabase.get().recordDao.selectRecord(firstPage*pageSize,pageSize).also { Log.d(TAG, "onLoadInitial: firstPage ${firstPage*pageSize} pageSize $pageSize selectRecord $it") }
        val resTotal = RecordDatabase.get().recordDao.selectCount()
        val pagingKData = BasePagingKRep.PagingKData<Record>().apply {
            current = firstPage
            size = pageSize
            total = resTotal
            records = res
        }
        return BasePagingKRep<Record>(1,"").apply {data = pagingKData  }.also { Log.d(TAG, "onLoadInitial: BasePagingKRep<Record> $it") }
    }

    override suspend fun onLoadAfter(adjacentPageKey: Int, pageSize: Int): BasePagingKRep<Record> {
        val res = RecordDatabase.get().recordDao.selectRecord(adjacentPageKey*pageSize,pageSize).also { Log.d(TAG, "onLoadAfter: adjacentPageKey ${adjacentPageKey*pageSize} pageSize $pageSize selectRecord $it") }
        val resTotal = RecordDatabase.get().recordDao.selectCount()
        val pagingKData = BasePagingKRep.PagingKData<Record>().apply {
            current = adjacentPageKey
            total = resTotal
            size = pageSize
            records = res
        }
        return BasePagingKRep<Record>(1,"").apply {data = pagingKData  }.also { Log.d(TAG, "onLoadAfter: BasePagingKRep<Record> $it") }
    }

    override suspend fun onDataAggregation(dataList: List<Record>): MutableList<Record> {
        val datas = mutableListOf<Record>()
        datas.addAll(dataList)
        return datas.also { Log.d(TAG, "onDataAggregation: datas $datas") }
    }
}