
public class Magazine extends Document {
private int magId;
private String company;

public Magazine(String name, String autName, String date,int num,String com){
	super(name, autName,date);
	magId = num;
	company = com;
}
}
