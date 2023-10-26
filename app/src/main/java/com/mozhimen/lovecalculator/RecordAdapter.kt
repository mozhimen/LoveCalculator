package com.mozhimen.lovecalculator

import android.annotation.SuppressLint
import android.widget.TextView
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
class RecordAdapter :AdapterKPageRecycler<Record>(R.layout.item_record,RecordDiff()) {
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: VHKRecycler, position: Int) {
        val item = getItem(position)?:return
        holder.findViewById<TextView>(R.id.item_record_txt).text =
            "${item.strTime}, 给${item.name}${if (item.action==1)"加" else "减"}${item.num}分, 总分为${item.total}分"
    }
}