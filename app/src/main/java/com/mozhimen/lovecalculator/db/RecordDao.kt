package com.mozhimen.lovecalculator.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * @ClassName RecordDao
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/10/26 23:53
 * @Version 1.0
 */
@Dao
interface RecordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addRecord(record: Record)

    @Query("select * from record order by time desc limit :pageSize offset :index")
    fun selectRecord(index:Int,pageSize:Int):List<Record>

    @Query("select count(*) from record")
    fun selectCount():Int
}