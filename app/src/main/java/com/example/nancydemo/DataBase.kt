package com.example.nancydemo

import android.annotation.SuppressLint
import android.database.sqlite.SQLiteOpenHelper
import kotlin.Throws
import android.database.sqlite.SQLiteDatabase
import android.content.ContentValues
import android.content.Context
import android.os.Build
import android.util.Log
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream
import java.lang.Error

class DataBase @SuppressLint("SdCardPath") constructor(context: Context?) :
    SQLiteOpenHelper(context, "LikeDb.db", null, 1) {
    var context: Context?
    var DB_NAME = "LikeDb.db"
    var path: String? = null
    private fun checkDataBase(): Boolean {
        val dbFile = File(path + DB_NAME)
        return dbFile.exists()
    }

    private fun copyDataBase() {
        if (!checkDataBase()) {
            this.readableDatabase
            close()
            try {
                copyDBFile()
            } catch (mIOException: IOException) {
                throw Error("ErrorCopyingDataBase")
            }
        }
    }

    @Throws(IOException::class)
    private fun copyDBFile() {
        val mInput = context!!.assets.open(DB_NAME)
        val mOutput: OutputStream = FileOutputStream(path + DB_NAME)
        val mBuffer = ByteArray(1024)
        var mLength: Int
        while (mInput.read(mBuffer).also { mLength = it } > 0) mOutput.write(mBuffer, 0, mLength)
        mOutput.flush()
        mOutput.close()
        mInput.close()
    }

    override fun onCreate(db: SQLiteDatabase) {}
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {}
    fun InsertFav(id: String) {
        val database = writableDatabase
        val values = ContentValues()
        values.put("Cat_id", 1)
        database.update("AllShayari", values, "id=$id", null)
    }

    init {
        path = if (Build.VERSION.SDK_INT >= 17) {
            context!!.applicationInfo.dataDir + "/databases/"
        } else {
            "/data/data/" + context!!.packageName + "/databases/"
        }
        this.context = context
        this.context = context
        copyDataBase()
        this.readableDatabase
    }


    @SuppressLint("Range")
    fun readdata(): ArrayList<QuotesModel> {
        var list = arrayListOf<QuotesModel>()
        var db = readableDatabase
        var query = "SELECT * FROM demolike"

        var cursor = db.rawQuery(query,null)

        if(cursor.moveToFirst())
        {
            do {
                var quotes = cursor.getString(cursor.getColumnIndex("Quotes"))
                var qid = cursor.getString(cursor.getColumnIndex("id"))
                var cid = cursor.getString(cursor.getColumnIndex("fav"))

                Log.e("TAG", "readdata: $qid $cid $quotes")
                list.add(QuotesModel(qid,cid,quotes))

            }while (cursor.moveToNext())
        }
        return list

    }

    fun updateData(data:QuotesModel)
    {
        var db = writableDatabase
        var contentValues = ContentValues()
        contentValues.put("fav",data.fav)
        contentValues.put("Quotes",data.quotes)

        var msg = db.update("demolike",contentValues,"id = ${data.id}",null)
        Log.e("TAG", "updateData: $msg" )
    }

}