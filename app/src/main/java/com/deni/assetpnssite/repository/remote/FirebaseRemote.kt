package com.deni.assetpnssite.repository.remote

import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.tasks.await

class FirebaseRemote {
    fun initApps() = flow {

    }

    fun getUser() = callbackFlow {
        val auth = Firebase.auth
        val listener = FirebaseAuth.AuthStateListener {
            close()
            trySend(it.currentUser)
        }
        auth.addAuthStateListener(listener)
        awaitClose {
            auth.removeAuthStateListener(listener)
        }
    }

    fun login() = flow {
        val auth = Firebase.auth
        auth.signInWithEmailAndPassword("","").await()
        emit(true)
    }
}