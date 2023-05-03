package ru.pakarpichev.getbinapplication.presentation.screens.resultScreen;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eJ\u001e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eJ\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u000eJ\u0016\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lru/pakarpichev/getbinapplication/presentation/screens/resultScreen/ResultViewModel;", "Landroidx/lifecycle/ViewModel;", "addRetrofitData", "Lru/pakarpichev/getbinapplication/domain/usecases/AddRetrofitData;", "(Lru/pakarpichev/getbinapplication/domain/usecases/AddRetrofitData;)V", "_data", "Landroidx/lifecycle/MutableLiveData;", "Lru/pakarpichev/getbinapplication/domain/model/RetrofitModel;", "data", "Landroidx/lifecycle/LiveData;", "getData", "()Landroidx/lifecycle/LiveData;", "tryCatchResult", "Landroidx/compose/runtime/MutableState;", "", "getTryCatchResult", "()Landroidx/compose/runtime/MutableState;", "setTryCatchResult", "(Landroidx/compose/runtime/MutableState;)V", "", "userText", "mapsView", "context", "Landroid/content/Context;", "latitude", "longtitude", "phoneCall", "phone", "urlView", "url", "app_debug"})
public final class ResultViewModel extends androidx.lifecycle.ViewModel {
    private final ru.pakarpichev.getbinapplication.domain.usecases.AddRetrofitData addRetrofitData = null;
    private final androidx.lifecycle.MutableLiveData<ru.pakarpichev.getbinapplication.domain.model.RetrofitModel> _data = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.lang.String> tryCatchResult;
    
    @javax.inject.Inject
    public ResultViewModel(@org.jetbrains.annotations.NotNull
    ru.pakarpichev.getbinapplication.domain.usecases.AddRetrofitData addRetrofitData) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<ru.pakarpichev.getbinapplication.domain.model.RetrofitModel> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getTryCatchResult() {
        return null;
    }
    
    public final void setTryCatchResult(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> p0) {
    }
    
    public final void getData(@org.jetbrains.annotations.NotNull
    java.lang.String userText) {
    }
    
    public final void phoneCall(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String phone) {
    }
    
    public final void urlView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
    
    public final void mapsView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String latitude, @org.jetbrains.annotations.NotNull
    java.lang.String longtitude) {
    }
}