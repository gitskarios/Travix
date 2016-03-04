package com.alorma.travisdk.datasource.logs.cache;

import com.alorma.travisdk.datasource.logs.GetLogDataSource;

public class CacheGetLogDataSource implements GetLogDataSource {
  @Override
  public String getLog(long jobId) throws Exception {
    return CacheLogWrapper.get(jobId);
  }
}
