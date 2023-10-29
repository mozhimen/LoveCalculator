package com.mozhimen.lovecalculator

import android.annotation.SuppressLint
import android.util.Log
import android.widget.TextView
import com.mozhimen.basick.utilk.bases.IUtilK
import com.mozhimen.lovecalculator.db.Record
import com.mozhimen.uicorek.adapterk.page.AdapterKPageRecycler
import com.mozhimen.uicorek.vhk.VHKRecycler

/**
 * @ClassName RecordAdapter
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/10/26 23:07
 * @Version 1.0
 */
class RecordAdapter :AdapterKPageRecycler<Record>(R.layout.item_record,RecordDiff()) ,IUtilK{
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: VHKRecycler, position: Int) {
        val item = getItem(position)?:return
        holder.findViewById<TextView>(R.id.item_record_txt).text =
            "${item.strTime}, ${item.name}${if (item.action==1)"+" else "-"}${item.num}分, 总分=${item.total}分"
        Log.d(TAG, "onBindViewHolder:item $item ")
    }
}