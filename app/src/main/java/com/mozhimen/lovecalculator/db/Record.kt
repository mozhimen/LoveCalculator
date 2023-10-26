package com.mozhimen.lovecalculator.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @ClassName MRecord
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/10/25 17:55
 * @Version 1.0
 */
//2023年10月26日13时18分,给哥哥加1分,总分为20分
@Entity("record")
data class Record(
    val total:Double,
    val num:Double,//多少分
    val action:Int,//+/- 1->+,0->-
    val name:String,
    val strTime:String,
    val time:Long,
    @PrimaryKey(autoGenerate = true)
    val id:Long = 0
)