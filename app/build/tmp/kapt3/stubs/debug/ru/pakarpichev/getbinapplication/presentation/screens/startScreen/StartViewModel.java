package ru.pakarpichev.getbinapplication.presentation.screens.startScreen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lru/pakarpichev/getbinapplication/presentation/screens/startScreen/StartViewModel;", "Landroidx/lifecycle/ViewModel;", "insertDataUseCase", "Lru/pakarpichev/getbinapplication/domain/usecases/InsertDataUseCase;", "(Lru/pakarpichev/getbinapplication/domain/usecases/InsertDataUseCase;)V", "insertData", "", "request", "Lru/pakarpichev/getbinapplication/domain/model/UserRequestModel;", "isOnline", "", "context", "Landroid/content/Context;", "app_debug"})
public final class StartViewModel extends androidx.lifecycle.ViewModel {
    private final ru.pakarpichev.getbinapplication.domain.usecases.InsertDataUseCase insertDataUseCase = null;
    
    @javax.inject.Inject
    public StartViewModel(@org.jetbrains.annotations.NotNull
    ru.pakarpichev.getbinapplication.domain.usecases.InsertDataUseCase insertDataUseCase) {
        super();
    }
    
    public final void insertData(@org.jetbrains.annotations.NotNull
    ru.pakarpichev.getbinapplication.domain.model.UserRequestModel request) {
    }
    
    public final boolean isOnline(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
}