package com.gmail.tyokaha.app.security;

import com.gmail.tyokaha.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
