package ru.pakarpichev.getbinapplication.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lru/pakarpichev/getbinapplication/di/BinModule;", "", "()V", "provideAppDb", "Lru/pakarpichev/getbinapplication/data/AppDatabase;", "appcontext", "Landroid/content/Context;", "provideRetrofit", "Lru/pakarpichev/getbinapplication/domain/repository/RetrofitRepository;", "providesBinDao", "Lru/pakarpichev/getbinapplication/domain/repository/BinRepository;", "appDatabase", "app_debug"})
@dagger.Module
public final class BinModule {
    
    public BinModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final ru.pakarpichev.getbinapplication.data.AppDatabase provideAppDb(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context appcontext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final ru.pakarpichev.getbinapplication.domain.repository.BinRepository providesBinDao(@org.jetbrains.annotations.NotNull
    ru.pakarpichev.getbinapplication.data.AppDatabase appDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final ru.pakarpichev.getbinapplication.domain.repository.RetrofitRepository provideRetrofit() {
        return null;
    }
}