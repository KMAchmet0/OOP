import java.util.*;
public class RecordCompany{
    private String recordCompanyName;
    private String recordCompanyCountry;
    private int recordCompanyID;
    
    private ArrayList myAlbums;
    
    public void addAlbum(Album aAlbum){
        myAlbums.add(aAlbum);
    }
    public RecordCompany(String CompanyName, String CompanyCountry, int CompanyID){
        recordCompanyName=CompanyName;
        recordCompanyCountry= CompanyCountry;
        recordCompanyID= CompanyID;
    }
    
    public void setRecordCompanyName(String CompanyName){
        this.recordCompanyName=CompanyName;
    }
    
    public void setRecordCompanyCountry(String CompanyCountry){
        this.recordCompanyCountry=CompanyCountry;
    }
    
    public int getRecordCompanyID(){
        return recordCompanyID;
    }
    
    public String getRecordCompanyName(){
        return recordCompanyName;
    }
    
    public String getRecordCompanyCountry(){
        return recordCompanyCountry;
    }
}