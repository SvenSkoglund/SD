package com.skilldistillery.stringstringbuilder.solutions;

public class UserComment2 {
  private int commentId;
  private UserComment2 inReplyToComment;
  private String date;
  private String time;
  private String userName;
  private String commentText;
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("On ");
    sb.append(date)
      .append(" at ")
      .append(time)
      .append(", ")
      .append(userName)
      .append(" posted this comment: [")
      .append(commentText)
      .append("]");
    return sb.toString();
  }
  
  public UserComment2(int commentId, UserComment2 inReplyToComment, String date, String time, String userName,
      String commentText) {
    super();
    this.commentId = commentId;
    this.inReplyToComment = inReplyToComment;
    this.date = date;
    this.time = time;
    this.userName = userName;
    this.commentText = commentText;
  }

  public UserComment2 getInReplyToComment() {
    return inReplyToComment;
  }

  public void setInReplyToComment(UserComment2 inReplyToComment) {
    this.inReplyToComment = inReplyToComment;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getCommentText() {
    return commentText;
  }

  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }

  public int getCommentId() {
    return commentId;
  }

}
