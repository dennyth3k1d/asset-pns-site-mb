package com.deni.assetpnssite.views.login

import kotlinx.coroutines.tasks.await
import android.text.Editable
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.flow.flow

class LoginUsecase {
    fun login(username: Editable?, password: Editable?) =
        flow {
            val firestore = Firebase.firestore
            val snapshot = firestore.collection("user").get().await()
                val user = snapshot?.documents?.find {
                    it?.getString("username") == username?.toString()
                }
                require(user != null) { "user tidak ditemukan"}
                val pass = user.getString("password")
                require(pass == password?.toString()) { "kata sandi salah"}
                emit(true)
        }
}