package model;

import java.io.Serializable;














public class Student
  implements Serializable
{
  static final long serialVersionUID = 1L;
  private String maSV;
  private String hovaten;
  private String IP;
  private int group;
  boolean isAlreadyRegistration = false;
  

  public boolean isIsAlreadyRegistration()
  {
    return isAlreadyRegistration;
  }
  
  public void setIsAlreadyRegistration(boolean isAlreadyRegistration) {
    this.isAlreadyRegistration = isAlreadyRegistration;
  }
  

  public int getGroup()
  {
    return group;
  }
  
  public Student(String maSV, String hovaten, String IP, int group) {
    this.maSV = maSV;
    this.hovaten = hovaten;
    this.IP = IP;
    this.group = group;
  }
  
  public String getMaSV()
  {
    return maSV;
  }
  
  public String getHovaten() {
    return hovaten;
  }
  
  public String getIP() {
    return IP;
  }
  
  public void setMaSV(String maSV) {
    this.maSV = maSV;
  }
  
  public void setHovaten(String hovaten) {
    this.hovaten = hovaten;
  }
  
  public void setIP(String IP) {
    this.IP = IP;
  }
  
  public void setNhom(int nhom) {
    group = nhom;
  }
}
