/*
 * Name: Joshan Rai
 * HW#: Lab03 from Chapter 04
 * Class: CS212
 * Date: 06/13/2021
 * Filename: CreditLimitCalculator.java
 */
import java.util.Scanner;

public class CreditLimitCalculator {
  int accNum, startBal, totalChar, totalCred, credLim;

  // set
  public void setAccInfo(int accNum, int startBal, int totalChar, int totalCred, int creditLim){
    setAccNum(accNum);
    setStartBal(startBal);
    setTotalChar(totalChar);
    setTotalCred(totalCred);
    setCreditLim(credLim);
  }
  public void setAccNum(int accNum){
    this.accNum = accNum;
  }
  public void setStartBal(int startBal){
    this.startBal = startBal;
  }
  public void setTotalChar(int totalChar){
    this.totalChar = totalChar;
  }
  public void setTotalCred(int totalCred){
    this.totalCred = totalCred;
  }
  public void setCreditLim(int credLim){
    this.credLim = credLim;
  }

  // get
  public int getAccNum(){
    return accNum;
  }
  public int getStartBal(){
    return startBal;
  }
  public int getCredLim(){
    return credLim;
  }
  public int getTotalChar(){
    return totalChar;
  }
  public int getTotalCred(){
    return totalCred;
  }
  public int getNewBal(){
    return getStartBal() - getTotalChar() + getTotalCred();
  }
  public boolean credExceeded(){
    return (getNewBal() > getCredLim()) ? false : true;
  }
}
