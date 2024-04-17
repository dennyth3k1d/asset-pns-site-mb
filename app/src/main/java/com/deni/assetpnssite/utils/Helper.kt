package com.deni.assetpnssite.utils

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.last

suspend fun <T> Flow<T>.get(isLast: Boolean = false) = catch { throw it }.run {
    if (isLast) last() else first()
}