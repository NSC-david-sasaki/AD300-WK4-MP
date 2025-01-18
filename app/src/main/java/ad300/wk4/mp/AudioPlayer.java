package ad300.wk4.mp;

public class AudioPlayer implements MediaPlayer{

    @Override
    public void play(Media content) throws Exception{
        if(content.format.equals(Media.Format.VINYL)){
            System.out.println("Audio playing"); 
            System.out.println("TITLE: "+content.getTitle());
            System.out.println("FORMAT: "+Media.Format.VINYL);
        }
        else{
            throw new Exception(content.getTitle()+" cannot be played with Audio Player");
        }
          
    }

    @Override
    public void pause(){
        System.out.println("Audio paused");
    }

    @Override
    public void stop(){
        System.out.println("Audio stopped");
    }

    

}