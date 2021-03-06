package com.alorma.travisdk.interactor.credentials;

import com.alorma.travisdk.bean.utils.Credential;
import java.util.List;
import rx.Observable;

public interface GetCredentialsInteractor {
  List<Credential> getCredentials();
  Observable<List<Credential>> getCredentialsObs();
}
