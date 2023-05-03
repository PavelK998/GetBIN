package ru.pakarpichev.getbinapplication.presentation.screens.historyScreen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\u0010R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lru/pakarpichev/getbinapplication/presentation/screens/historyScreen/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "getAllDataUseCase", "Lru/pakarpichev/getbinapplication/domain/usecases/GetAllDataUseCase;", "deleteDataUseCase", "Lru/pakarpichev/getbinapplication/domain/usecases/DeleteDataUseCase;", "(Lru/pakarpichev/getbinapplication/domain/usecases/GetAllDataUseCase;Lru/pakarpichev/getbinapplication/domain/usecases/DeleteDataUseCase;)V", "_request", "Landroidx/lifecycle/MutableLiveData;", "", "Lru/pakarpichev/getbinapplication/domain/model/UserRequestModel;", "request", "Landroidx/lifecycle/LiveData;", "getRequest", "()Landroidx/lifecycle/LiveData;", "deleteAllData", "", "deleteData", "getAllData", "app_debug"})
public final class HistoryViewModel extends androidx.lifecycle.ViewModel {
    private final ru.pakarpichev.getbinapplication.domain.usecases.GetAllDataUseCase getAllDataUseCase = null;
    private final ru.pakarpichev.getbinapplication.domain.usecases.DeleteDataUseCase deleteDataUseCase = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<ru.pakarpichev.getbinapplication.domain.model.UserRequestModel>> _request;
    
    @javax.inject.Inject
    public HistoryViewModel(@org.jetbrains.annotations.NotNull
    ru.pakarpichev.getbinapplication.domain.usecases.GetAllDataUseCase getAllDataUseCase, @org.jetbrains.annotations.NotNull
    ru.pakarpichev.getbinapplication.domain.usecases.DeleteDataUseCase deleteDataUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<ru.pakarpichev.getbinapplication.domain.model.UserRequestModel>> getRequest() {
        return null;
    }
    
    public final void getAllData() {
    }
    
    public final void deleteData(@org.jetbrains.annotations.NotNull
    ru.pakarpichev.getbinapplication.domain.model.UserRequestModel request) {
    }
    
    public final void deleteAllData() {
    }
}