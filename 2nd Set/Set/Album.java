public abstract class Album {
    private String albumTitle; //Θέτουμε τις μεθόδους που θα χρησιμοποιήσουμε
    private String albumArtist;
    private int albumID;
    
    private static int count =9990; //Για να έχουμε τα αποτελέσματα που θέλει η άσκηση
                                      
    
    
    
    
    public Album(String Title, String Artist){ 
        albumTitle = Title;
        albumArtist = Artist;
        
        count++;
        albumID = Integer.parseInt(Integer.toString(count));
    }
    
    public void setAlbumTitle(String Title){
        this.albumTitle=Title;
    }
    
    public void setAlbumArtist(String Artist){
        this.albumArtist = Artist;
    }
    
    public int getAlbumID(){
        return albumID;
    }
    
    public String getAlbumTitle(){
        return albumTitle;
    }
    public String getAlbumArtist(){
        return albumArtist;
    }
    abstract public String albumFormatDetails();
}
    
