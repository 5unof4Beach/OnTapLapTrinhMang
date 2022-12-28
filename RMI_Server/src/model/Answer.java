package model;

import java.io.Serializable;









public class Answer
  implements Serializable
{
  static final long serialVersionUID = 2L;
  Student student;
  String reverseStringAnswer;
  String normalizationStringAnswer;
  int maxNumericAnswer;
  int uclnNumericAnswer;
  int bcnnNumericAnswer;
  
  public Answer() {}
  
  boolean isAlreadyRegistration = false;
  
  boolean isReverseStringAnswerRight = false;
  boolean isMaxNumericAnswerRight = false;
  boolean isNormalizationStringAnswerRight = false;
  boolean isBSCNNNumericAnswerRight = false;
  boolean isUSCLNNumericAnswerRight = false;
  
  public boolean isIsAlreadyRegistration() {
    return isAlreadyRegistration;
  }
  
  public void setIsAlreadyRegistration(boolean isAlreadyRegistration) {
    this.isAlreadyRegistration = isAlreadyRegistration;
  }
  
  public Student getStudent()
  {
    return student;
  }
  
  public void setStudent(Student student) {
    this.student = student;
  }
  
  public String getStringAnswer() {
    return reverseStringAnswer;
  }
  
  public void setStringAnswer(String stringAnswer) {
    reverseStringAnswer = stringAnswer;
  }
  
  public int getNumericAnswer() {
    return maxNumericAnswer;
  }
  
  public void setNumericAnswer(int numericAnswer) {
    maxNumericAnswer = numericAnswer;
  }
  
  public boolean isIsStringAnswerRight() {
    return isReverseStringAnswerRight;
  }
  
  public void setIsStringAnswerRight(boolean isStringAnswerRight) {
    isReverseStringAnswerRight = isStringAnswerRight;
  }
  
  public boolean isIsNumericAnswerRight() {
    return isMaxNumericAnswerRight;
  }
  
  public void setIsNumericAnswerRight(boolean isNumericAnswerRight) {
    isMaxNumericAnswerRight = isNumericAnswerRight;
  }
  


  public boolean isIsReverseStringAnswerRight()
  {
    return isReverseStringAnswerRight;
  }
  
  public void setIsReverseStringAnswerRight(boolean isReverseStringAnswerRight) {
    this.isReverseStringAnswerRight = isReverseStringAnswerRight;
  }
  
  public boolean isIsMaxNumericAnswerRight() {
    return isMaxNumericAnswerRight;
  }
  
  public void setIsMaxNumericAnswerRight(boolean isMaxNumericAnswerRight) {
    this.isMaxNumericAnswerRight = isMaxNumericAnswerRight;
  }
  
  public boolean isIsNormalizationStringAnswerRight() {
    return isNormalizationStringAnswerRight;
  }
  
  public void setIsNormalizationStringAnswerRight(boolean isNormalizationStringAnswerRight) {
    this.isNormalizationStringAnswerRight = isNormalizationStringAnswerRight;
  }
  
  public boolean isIsBSCNNNumericAnswerRight() {
    return isBSCNNNumericAnswerRight;
  }
  
  public void setIsBSCNNNumericAnswerRight(boolean isBSCNNNumericAnswerRight) {
    this.isBSCNNNumericAnswerRight = isBSCNNNumericAnswerRight;
  }
  
  public boolean isIsUSCLNNumericAnswerRight() {
    return isUSCLNNumericAnswerRight;
  }
  
  public void setIsUSCLNNumericAnswerRight(boolean isUSCLNNumericAnswerRight) {
    this.isUSCLNNumericAnswerRight = isUSCLNNumericAnswerRight;
  }
  
  public String getReverserStringAnswer() {
    return reverseStringAnswer;
  }
  
  public void setReverserStringAnswer(String reverserStringAnswer) {
    reverseStringAnswer = reverserStringAnswer;
  }
  
  public String getNormalizationStringAnswer() {
    return normalizationStringAnswer;
  }
  
  public void setNormalizationStringAnswer(String normalizationStringAnswer) {
    this.normalizationStringAnswer = normalizationStringAnswer;
  }
  
  public int getMaxNumericAnswer() {
    return maxNumericAnswer;
  }
  
  public void setMaxNumericAnswer(int maxNumericAnswer) {
    this.maxNumericAnswer = maxNumericAnswer;
  }
  
  public int getUclnNumericAnswer() {
    return uclnNumericAnswer;
  }
  
  public void setUclnNumericAnswer(int uclnNumericAnswer) {
    this.uclnNumericAnswer = uclnNumericAnswer;
  }
  
  public int getBcnnNumericAnswer() {
    return bcnnNumericAnswer;
  }
  
  public void setBcnnNumericAnswer(int bcnnNumericAnswer) {
    this.bcnnNumericAnswer = bcnnNumericAnswer;
  }
}
