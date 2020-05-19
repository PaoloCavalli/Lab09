package it.polito.tdp.borders.model;

public class Country {
  private Integer cCode;
  private String nameCode;
  private String name;
/**
 * @param cCode
 * @param nameCode
 * @param name
 */
public Country(Integer cCode, String nameCode, String name) {
	super();
	this.cCode = cCode;
	this.nameCode = nameCode;
	this.name = name;
}

public Integer getcCode() {
	return cCode;
}
public void setcCode(Integer cCode) {
	this.cCode = cCode;
}
public String getNameCode() {
	return nameCode;
}
public void setNameCode(String nameCode) {
	this.nameCode = nameCode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  
  
  
}
