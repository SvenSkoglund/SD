package com.skilldistillery.stringstringbuilder.solutions;

public class UserComment3 {
  private int commentId;
  private UserComment3 inReplyToComment;
  private String date;
  private String time;
  private String userName;
  private String commentText;
  
  
//  @Override
//  public String toString() {
//    StringBuilder sb = new StringBuilder("On ");
//    sb.append(date)
//      .append(" at ")
//      .append(time)
//      .append(", ")
//      .append(userName)
//      .append(" posted this comment: [")
//      .append(commentText)
//      .append("]");
//    return sb.toString();
//  }

  // Eclipse default toString
//  @Override
//  public String toString() {
//    return "UserComment3 [commentId=" + commentId + ", inReplyToComment=" + inReplyToComment + ", date=" + date
//        + ", time=" + time + ", userName=" + userName + ", commentText=" + commentText + "]";
//  }

  // Code style: StringBuilder/StringBuffer
//  @Override
//  public String toString() {
//    StringBuilder builder = new StringBuilder();
//    builder.append("UserComment3 [commentId=");
//    builder.append(commentId);
//    builder.append(", inReplyToComment=");
//    builder.append(inReplyToComment);
//    builder.append(", date=");
//    builder.append(date);
//    builder.append(", time=");
//    builder.append(time);
//    builder.append(", userName=");
//    builder.append(userName);
//    builder.append(", commentText=");
//    builder.append(commentText);
//    builder.append("]");
//    return builder.toString();
//  }
  
  // Code style: StringBuilder/StringBuffer - chained calls
  // Skip null values
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("UserComment3 [commentId=").append(commentId).append(", ");
    if (inReplyToComment != null)
      builder.append("inReplyToComment=").append(inReplyToComment).append(", ");
    if (date != null)
      builder.append("date=").append(date).append(", ");
    if (time != null)
      builder.append("time=").append(time).append(", ");
    if (userName != null)
      builder.append("userName=").append(userName).append(", ");
    if (commentText != null)
      builder.append("commentText=").append(commentText);
    builder.append("]");
    return builder.toString();
  }
  
  
  public UserComment3(int commentId, UserComment3 inReplyToComment, String date, String time, String userName,
      String commentText) {
    super();
    this.commentId = commentId;
    this.inReplyToComment = inReplyToComment;
    this.date = date;
    this.time = time;
    this.userName = userName;
    this.commentText = commentText;
  }

  public UserComment3 getInReplyToComment() {
    return inReplyToComment;
  }

  public void setInReplyToComment(UserComment3 inReplyToComment) {
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
