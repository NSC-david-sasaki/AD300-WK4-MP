package ad300.wk4.mp;

public class StreamingPlayer implements MediaPlayer{
    
    @Override
    public void play(Media content)throws Exception{
        if(content.format.equals(Media.Format.STREAM)){
            System.out.println("Playing stream now");
            System.out.println("TITLE: "+content.getTitle());
            System.out.println("FORMAT: "+Media.Format.STREAM);

        }
        else{
            throw new Exception(content.getTitle()+" cannot be played with Stream Player");
        }     
    }

    @Override
    public void pause(){
        System.out.println("Streaming paused");
    }

    @Override
    public void stop(){
        System.out.println("Stream stopped");
    }

   
}