package ir.sinapp.mvp.api.data

import android.util.LruCache


class CacheData(size: Int) {

    var cache: LruCache<String, Any> = LruCache(size)

    fun add(key: String , v :Any): Any? = cache.put(key , v)

    fun get(key :String): Any? = cache[key]

}