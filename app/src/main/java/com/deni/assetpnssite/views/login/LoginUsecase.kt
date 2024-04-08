package com.deni.assetpnssite.views.login

import android.text.Editable
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import kotlinx.coroutines.flow.flow

class LoginUsecase {
    fun login(username: Editable?, password: Editable?) =
        flow {
            val firestore = Firebase.firestore

        }
}