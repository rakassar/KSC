package crm.mhc.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataFromExcel {
	
	public static String userCRMNEXT_COL02;
	public static String Password;
	public static String Citizen_ID;
	public static String AccountNumber;
	public static String MobileNumber;
	public static String CardNumber;
	public static String Firstname;
	public static String Lastname;
	public static String OfficePhone;
	public static String HomePhone;
	public static String userCRMNEXT_COL07;
	public static String active;
	public static String sequence;
	public static String actionchannel;
	public static String priority;
	
	
	
	
	public static String Employeetype;
	public static String SourceoffundsEmp;
	public static String SourceoffundsUnemp;
	public static String SourceoffundsSelemp;
	
	public static String occupation;
	public static String IncomeRange;
	public static String workingsincemonth;
	public static String workingsinceyear;
	public static String EconomicActivity;
	public static String Industry_Classification;
	public static String NatureOfWork;
	public static String forEmployment;
	public static String IDPrrof;
	public static String AoCode;
	public static String Zipcode;
	public static String mailingaddress;
	public static String BBN;
	public static String PermanentAddresssameasPresentAddress;
	
	public static String Ofac;

	
	
//CRSC
	public static String AmlcUnJmf;
	public static String BankInternalChecklist;
	public static String AllegedPerdsonf;
	public static String HPIOrJoint;
	public static String BenifOFW;
	public static String ForeignNational;
	public static String NeumberAccount;
	public static String EmploymentTypeCRRSC;
	public static String IndustryCRRSC;
	public static String EconmicactivityeCRRSC;
	public static String managerialCRRSC;
	public static String DirectDealingCRRSC;
	public static String customerdeclaredCRRSC;
	
	
	
	public static String CityCRRSC;
	public static String ProvinceCRRSC;
	public static String RiskCRRSC;
	public static String vicinityRRSC;
	public static String intialdepositeRRSC;
	public static String InwprdOutwordRRSC;
	public static String ComfortableInformationRRSC;
	public static String ComfortableDocumentsRRSC;
 
	//Fill Account Information
	
	public static String RequestTypef;
	public static String Purposeofaccountopening;
	public static String ADBRequired;
	public static String PromsEmail;
	public static String PromsSMS;
	public static String TransactionalEmail;
	public static String TransactionalSMS;
	
	
	
public static void DataRead() throws IOException {

//public static void main (String [] args) throws IOException{
		
FileInputStream fs = new FileInputStream("D:\\Rizwan\\Automation\\lib\\KSC_Datafromexcel.xlsx");
//Creating a workbook
XSSFWorkbook workbook = new XSSFWorkbook(fs);
XSSFSheet sheet = workbook.getSheetAt(0);
XSSFSheet sheet1 = workbook.getSheetAt(1);
XSSFSheet sheet2 = workbook.getSheetAt(2);

userCRMNEXT_COL02=sheet.getRow(0).getCell(1).getStringCellValue();
Password=sheet.getRow(1).getCell(1).getStringCellValue();
Citizen_ID=sheet.getRow(2).getCell(1).getStringCellValue();
AccountNumber=sheet.getRow(3).getCell(1).getStringCellValue();
MobileNumber=sheet.getRow(4).getCell(1).getStringCellValue();
CardNumber=sheet.getRow(5).getCell(1).getStringCellValue();
Firstname=sheet.getRow(6).getCell(1).getStringCellValue();
Lastname=sheet.getRow(7).getCell(1).getStringCellValue();
OfficePhone=sheet.getRow(8).getCell(1).getStringCellValue();
HomePhone=sheet.getRow(9).getCell(1).getStringCellValue();
userCRMNEXT_COL07=sheet.getRow(10).getCell(1).getStringCellValue();
active=sheet.getRow(11).getCell(1).getStringCellValue();
sequence=sheet.getRow(12).getCell(1).getStringCellValue();
actionchannel=sheet.getRow(13).getCell(1).getStringCellValue();
priority=sheet.getRow(14).getCell(1).getStringCellValue();
Employeetype=sheet.getRow(15).getCell(1).getStringCellValue();
SourceoffundsEmp=sheet.getRow(16).getCell(1).getStringCellValue();
occupation=sheet.getRow(17).getCell(1).getStringCellValue();
IncomeRange=sheet.getRow(18).getCell(1).getStringCellValue();
workingsincemonth=sheet.getRow(19).getCell(1).getStringCellValue();
workingsinceyear=sheet.getRow(20).getCell(1).getStringCellValue();
EconomicActivity=sheet.getRow(21).getCell(1).getStringCellValue();
Industry_Classification=sheet.getRow(22).getCell(1).getStringCellValue();
NatureOfWork=sheet.getRow(23).getCell(1).getStringCellValue();
forEmployment=sheet.getRow(24).getCell(1).getStringCellValue();
IDPrrof=sheet.getRow(25).getCell(1).getStringCellValue();
AoCode=sheet.getRow(26).getCell(1).getStringCellValue();
Zipcode=sheet.getRow(27).getCell(1).getStringCellValue();
mailingaddress=sheet.getRow(28).getCell(1).getStringCellValue();
SourceoffundsUnemp=sheet.getRow(29).getCell(1).getStringCellValue();
SourceoffundsSelemp=sheet.getRow(30).getCell(1).getStringCellValue();
BBN=sheet.getRow(31).getCell(1).getStringCellValue();
PermanentAddresssameasPresentAddress=sheet.getRow(32).getCell(1).getStringCellValue();
Ofac=sheet.getRow(33).getCell(1).getStringCellValue();



//CRRSC
AmlcUnJmf=sheet1.getRow(0).getCell(1).getStringCellValue();
BankInternalChecklist=sheet1.getRow(1).getCell(1).getStringCellValue();
AllegedPerdsonf=sheet1.getRow(2).getCell(1).getStringCellValue();
HPIOrJoint=sheet1.getRow(3).getCell(1).getStringCellValue();
BenifOFW=sheet1.getRow(4).getCell(1).getStringCellValue();
ForeignNational=sheet1.getRow(5).getCell(1).getStringCellValue();
NeumberAccount=sheet1.getRow(6).getCell(1).getStringCellValue();
EmploymentTypeCRRSC=sheet1.getRow(7).getCell(1).getStringCellValue();
CityCRRSC=sheet1.getRow(8).getCell(1).getStringCellValue();
ProvinceCRRSC=sheet1.getRow(9).getCell(1).getStringCellValue();
RiskCRRSC=sheet1.getRow(10).getCell(1).getStringCellValue();
vicinityRRSC=sheet1.getRow(11).getCell(1).getStringCellValue();
intialdepositeRRSC=sheet1.getRow(12).getCell(1).getStringCellValue();
InwprdOutwordRRSC=sheet1.getRow(13).getCell(1).getStringCellValue();
ComfortableInformationRRSC=sheet1.getRow(14).getCell(1).getStringCellValue();
ComfortableDocumentsRRSC=sheet1.getRow(15).getCell(1).getStringCellValue();
IndustryCRRSC=sheet1.getRow(16).getCell(1).getStringCellValue();
EconmicactivityeCRRSC=sheet1.getRow(17).getCell(1).getStringCellValue();
managerialCRRSC=sheet1.getRow(18).getCell(1).getStringCellValue();
DirectDealingCRRSC=sheet1.getRow(19).getCell(1).getStringCellValue();
customerdeclaredCRRSC=sheet1.getRow(20).getCell(1).getStringCellValue();



  
  RequestTypef=sheet2.getRow(0).getCell(1).getStringCellValue();
  Purposeofaccountopening=sheet2.getRow(1).getCell(1).getStringCellValue();
  ADBRequired=sheet2.getRow(2).getCell(1).getStringCellValue();
  PromsEmail=sheet2.getRow(3).getCell(1).getStringCellValue();
  PromsSMS=sheet2.getRow(4).getCell(1).getStringCellValue();
  TransactionalEmail=sheet2.getRow(5).getCell(1).getStringCellValue();
  TransactionalSMS=sheet2.getRow(6).getCell(1).getStringCellValue();
 



Row row1 = sheet.getRow(1);
Cell cell1 = row1.getCell(1);
System.out.println(sheet.getRow(0).getCell(1));
Row row2 = sheet.getRow(1);
Cell cell2 = row2.getCell(1);
System.out.println(sheet.getRow(1).getCell(0));
Row row3 = sheet.getRow(1);
Cell cell3 = row3.getCell(1);



	
		
	}

}
