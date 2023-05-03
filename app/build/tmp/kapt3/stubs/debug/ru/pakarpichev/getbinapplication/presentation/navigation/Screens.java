package ru.pakarpichev.getbinapplication.presentation.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lru/pakarpichev/getbinapplication/presentation/navigation/Screens;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "HistoryScreen", "ResultScreen", "SplashScreen", "StartScreen", "Lru/pakarpichev/getbinapplication/presentation/navigation/Screens$HistoryScreen;", "Lru/pakarpichev/getbinapplication/presentation/navigation/Screens$ResultScreen;", "Lru/pakarpichev/getbinapplication/presentation/navigation/Screens$SplashScreen;", "Lru/pakarpichev/getbinapplication/presentation/navigation/Screens$StartScreen;", "app_debug"})
public abstract class Screens {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    
    private Screens(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/pakarpichev/getbinapplication/presentation/navigation/Screens$StartScreen;", "Lru/pakarpichev/getbinapplication/presentation/navigation/Screens;", "()V", "app_debug"})
    public static final class StartScreen extends ru.pakarpichev.getbinapplication.presentation.navigation.Screens {
        @org.jetbrains.annotations.NotNull
        public static final ru.pakarpichev.getbinapplication.presentation.navigation.Screens.StartScreen INSTANCE = null;
        
        private StartScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/pakarpichev/getbinapplication/presentation/navigation/Screens$ResultScreen;", "Lru/pakarpichev/getbinapplication/presentation/navigation/Screens;", "()V", "app_debug"})
    public static final class ResultScreen extends ru.pakarpichev.getbinapplication.presentation.navigation.Screens {
        @org.jetbrains.annotations.NotNull
        public static final ru.pakarpichev.getbinapplication.presentation.navigation.Screens.ResultScreen INSTANCE = null;
        
        private ResultScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/pakarpichev/getbinapplication/presentation/navigation/Screens$HistoryScreen;", "Lru/pakarpichev/getbinapplication/presentation/navigation/Screens;", "()V", "app_debug"})
    public static final class HistoryScreen extends ru.pakarpichev.getbinapplication.presentation.navigation.Screens {
        @org.jetbrains.annotations.NotNull
        public static final ru.pakarpichev.getbinapplication.presentation.navigation.Screens.HistoryScreen INSTANCE = null;
        
        private HistoryScreen() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lru/pakarpichev/getbinapplication/presentation/navigation/Screens$SplashScreen;", "Lru/pakarpichev/getbinapplication/presentation/navigation/Screens;", "()V", "app_debug"})
    public static final class SplashScreen extends ru.pakarpichev.getbinapplication.presentation.navigation.Screens {
        @org.jetbrains.annotations.NotNull
        public static final ru.pakarpichev.getbinapplication.presentation.navigation.Screens.SplashScreen INSTANCE = null;
        
        private SplashScreen() {
            super(null);
        }
    }
}