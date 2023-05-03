package ru.pakarpichev.getbinapplication.di;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = BinApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface BinApp_GeneratedInjector {
  void injectBinApp(BinApp binApp);
}
