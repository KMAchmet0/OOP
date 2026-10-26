public class DigitalAlbum extends Album{
    private int size = 0;
    private String downloadURL;
    public DigitalAlbum(String Title, String Artist, int size, String downloadURL){
        super(Title, Artist);
        this.size = size;
        this.downloadURL = downloadURL;
    }
    public void setSize(int digitalAlbumSize){
        digitalAlbumSize = digitalAlbumSize;
    }
    public void setDownload(String url){
    url=url;
    }
    public String getDownloadURL(){
        return downloadURL;
    }
    public String albumFormatDetails(){
        String StringSize;
        StringSize =String.valueOf(size);
        return StringSize+ "MB ";
    }
}