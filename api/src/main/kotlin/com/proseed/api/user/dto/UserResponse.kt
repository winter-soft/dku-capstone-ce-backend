package com.proseed.api.user.dto

import com.proseed.api.user.model.Role
import com.proseed.api.user.model.User

data class UserResponse(
    val user_email: String,
    val user_nickName: String,
    val user_platformType: String,
    val user_preference: String? = null,
    val user_role: Role
) {
    constructor(user: User) : this(user.email, user.nickName, user.platformType, user.preference, user.role)
}