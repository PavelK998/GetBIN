package ru.pakarpichev.getbinapplication.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007J\b\u0010\u000e\u001a\u00020\bH\u0007\u00a8\u0006\u000f"}, d2 = {"Lru/pakarpichev/getbinapplication/di/FirebaseModule;", "", "()V", "provideAuthRepository", "Lru/pakarpichev/getbinapplication/data/firebase/AuthRepositoryImpl;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "firebaseFirestore", "Lcom/google/firebase/firestore/FirebaseFirestore;", "provideAuthUseCase", "Lru/pakarpichev/getbinapplication/domain/usecases/AuthUseCase;", "authRepository", "Lru/pakarpichev/getbinapplication/domain/repository/AuthRepository;", "provideFirebaseAuth", "provideFirebaseFirestore", "app_debug"})
@dagger.Module
public final class FirebaseModule {
    @org.jetbrains.annotations.NotNull
    public static final ru.pakarpichev.getbinapplication.di.FirebaseModule INSTANCE = null;
    
    private FirebaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.google.firebase.auth.FirebaseAuth provideFirebaseAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final com.google.firebase.firestore.FirebaseFirestore provideFirebaseFirestore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final ru.pakarpichev.getbinapplication.data.firebase.AuthRepositoryImpl provideAuthRepository(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth firebaseAuth, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.FirebaseFirestore firebaseFirestore) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    @javax.inject.Singleton
    public final ru.pakarpichev.getbinapplication.domain.usecases.AuthUseCase provideAuthUseCase(@org.jetbrains.annotations.NotNull
    ru.pakarpichev.getbinapplication.domain.repository.AuthRepository authRepository) {
        return null;
    }
}