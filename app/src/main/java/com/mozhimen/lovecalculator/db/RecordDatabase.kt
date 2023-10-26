package com.mozhimen.lovecalculator.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mozhimen.basick.utilk.android.app.UtilKApplication

/**
 * @ClassName RecordDatabase
 * @Description TODO
 * @Author Mozhimen / Kolin Zhao
 * @Date 2023/10/26 23:51
 * @Version 1.0
 */
@Database(entities = [Record::class], version = 1, exportSchema = false)
abstract class RecordDatabase : RoomDatabase() {
    abstract val recordDao: RecordDao

    companion object {
        @Volatile
        private var _db: RecordDatabase =
            Room.databaseBuilder(UtilKApplication.instance.applicationContext, RecordDatabase::class.java, "lv_record_db").allowMainThreadQueries() .build()

        @JvmStatic
        fun get(): RecordDatabase {
            return _db
        }
    }
}
