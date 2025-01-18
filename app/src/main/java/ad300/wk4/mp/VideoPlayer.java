package ad300.wk4.mp;

public class VideoPlayer implements MediaPlayer{
    
    @Override
    public void play(Media content)throws Exception{
        if(content.format.equals(Media.Format.BLURAY)){
            System.out.println("BluRay video playing"); 
            System.out.println("Playing video now");
            System.out.println("TITLE: "+content.getTitle());
            System.out.println("FORMAT: "+Media.Format.BLURAY);
        }
        else{
            throw new Exception(content.getTitle()+" cannot be played with Video Player");
        }        
    }

    @Override
    public void pause(){
        System.out.println("Video paused");
    }

    @Override
    public void stop(){
        System.out.println("Video stopped");
    }

}