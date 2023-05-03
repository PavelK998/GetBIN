// Generated by Dagger (https://dagger.dev).
package ru.pakarpichev.getbinapplication.domain.usecases;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import ru.pakarpichev.getbinapplication.domain.repository.AuthRepository;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthUseCase_Factory implements Factory<AuthUseCase> {
  private final Provider<AuthRepository> repositoryProvider;

  public AuthUseCase_Factory(Provider<AuthRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public AuthUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static AuthUseCase_Factory create(Provider<AuthRepository> repositoryProvider) {
    return new AuthUseCase_Factory(repositoryProvider);
  }

  public static AuthUseCase newInstance(AuthRepository repository) {
    return new AuthUseCase(repository);
  }
}
