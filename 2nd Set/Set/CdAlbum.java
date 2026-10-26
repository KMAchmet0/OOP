public class CdAlbum extends Album{
    private int noCD;
    
    
    
    public CdAlbum(String Title, String Artist, int noCD){
        super(Title, Artist);
        this.noCD=noCD;
    }
    
    
    
    public void setNoCD(int CDnumber){
        CDnumber=CDnumber;
    }
    
    
    
    public String albumFormatDetails(){
        String StringNoCD;
        StringNoCD = String.valueOf(noCD);
        return StringNoCD+" CD ";
    }
}