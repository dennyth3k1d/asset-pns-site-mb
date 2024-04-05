package com.deni.assetpnssite.views.login

import android.text.Editable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewmodel : ViewModel() {
    fun login(username: Editable, password: Editable) =
        viewModelScope.launch(Dispatchers.IO) {

        }
}