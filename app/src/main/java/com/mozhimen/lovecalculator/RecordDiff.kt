package com.mozhimen.lovecalculator

import androidx.recyclerview.widget.DiffUtil
import com.mozhimen.lovecalculator.db.Record

/**
 * @ClassName MRecordDiff
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/10/26 23:12
 * @Version 1.0
 */
class RecordDiff: DiffUtil.ItemCallback<Record>() {
    override fun areItemsTheSame(oldItem: Record, newItem: Record): Boolean {
       return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Record, newItem: Record): Boolean {
        return oldItem.id == newItem.id
    }
}