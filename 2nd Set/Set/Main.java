import java.util.ArrayList;

public class Main{
    
    public static void main(String[] args){
        ArrayList<Album> albums= new ArrayList<Album>();
        
        DigitalAlbum DA = new DigitalAlbum("Essentials" ,
        "John Williams" , 102, "102MB");
        
        CdAlbum CA = new CdAlbum("Communique" , "Dire Straits" ,2);
        albums.add(DA);
        
        albums.add(CA);
        
        RecordCompany RCA= new RecordCompany("RCA" ,"  " ,999);
        
        ArrayList<Album> myAlbums= new ArrayList<Album>();
        
        myAlbums.add(DA);
        
        myAlbums.add(CA);
        
        for (Album album: albums){
            System.out.println("Album ID: " +album.getAlbumID());
            
            System.out.println("Album Title: " +album.getAlbumTitle());
            
            System.out.println("Album Artist: " +album.getAlbumArtist());
            
            System.out.println("Album Details: " +album.albumFormatDetails());
            
        }
        
        System.out.println("Albums released by " +RCA.getRecordCompanyID() +", ID" +RCA.getRecordCompanyID());
        for(Album alb: myAlbums){
                System.out.println(alb.getAlbumTitle());
            }
            
        }
    }