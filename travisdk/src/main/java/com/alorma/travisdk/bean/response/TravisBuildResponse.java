package com.alorma.travisdk.bean.response;

import android.support.annotation.StringDef;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

public class TravisBuildResponse {
  @SerializedName("commit_id") private long commitId;
  private TravisConfig config;
  private long duration;

  private long id;

  @SerializedName("job_ids") private long[] jobs;

  private long number;

  @SerializedName("pull_request") private boolean pullRequest;

  @SerializedName("pull_request_number") private String pullRequestNumber;

  @SerializedName("pull_request_title") private String pullRequestTitle;

  @SerializedName("repository_id") private long repoId;

  @SerializedName("started_at") private String startedAt;

  @SerializedName("finished_at") private String finishedAt;

  @StringDef({
      BuildState.CREATED, BuildState.QUEUED, BuildState.STARTED, BuildState.PASSED,
      BuildState.FAILED, BuildState.ERRORED, BuildState.CANCELED, BuildState.READY
  }) public @interface State {

  }

  @State private String state;

  private TravisCommitResponse commit;

  public long getCommitId() {
    return commitId;
  }

  public void setCommitId(long commitId) {
    this.commitId = commitId;
  }

  public TravisConfig getConfig() {
    return config;
  }

  public void setConfig(TravisConfig config) {
    this.config = config;
  }

  public long getDuration() {
    return duration;
  }

  public void setDuration(long duration) {
    this.duration = duration;
  }

  public String getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long[] getJobs() {
    return jobs;
  }

  public void setJobs(long[] jobs) {
    this.jobs = jobs;
  }

  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  public boolean isPullRequest() {
    return pullRequest;
  }

  public void setPullRequest(boolean pullRequest) {
    this.pullRequest = pullRequest;
  }

  public String getPullRequestNumber() {
    return pullRequestNumber;
  }

  public void setPullRequestNumber(String pullRequestNumber) {
    this.pullRequestNumber = pullRequestNumber;
  }

  public String getPullRequestTitle() {
    return pullRequestTitle;
  }

  public void setPullRequestTitle(String pullRequestTitle) {
    this.pullRequestTitle = pullRequestTitle;
  }

  public long getRepoId() {
    return repoId;
  }

  public void setRepoId(long repoId) {
    this.repoId = repoId;
  }

  public String getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }

  @State
  public String getState() {
    return state;
  }

  public void setState(@State String state) {
    this.state = state;
  }

  public TravisCommitResponse getCommit() {
    return commit;
  }

  public void setCommit(TravisCommitResponse commit) {
    this.commit = commit;
  }

  @Override
  public String toString() {
    return "TravisBuildResponse{" +
        "commitId=" + commitId +
        ", config=" + config +
        ", duration=" + duration +
        ", finishedAt='" + finishedAt + '\'' +
        ", id=" + id +
        ", jobs=" + Arrays.toString(jobs) +
        ", number=" + number +
        ", pullRequest=" + pullRequest +
        ", pullRequestNumber='" + pullRequestNumber + '\'' +
        ", pullRequestTitle='" + pullRequestTitle + '\'' +
        ", repoId='" + repoId + '\'' +
        ", startedAt='" + startedAt + '\'' +
        ", state='" + state + '\'' +
        '}';
  }
}
