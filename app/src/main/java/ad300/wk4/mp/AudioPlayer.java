package ad300.wk4.mp;

public class AudioPlayer extends BasePlayer{

    @Override
    public void play(Media content) throws Exception{
        if(content.format.equals(Media.Format.VINYL)){
            System.out.println("Audio playing"); 
            super.play(content);
            System.out.println("TITLE: "+content.getTitle());
            System.out.println("FORMAT: "+Media.Format.VINYL);
        }
        else{
            throw new Exception(content.getTitle()+" cannot be played with Audio Player");
        }
          
    }

    @Override
    public void pause() throws Exception{
        if (this.state.equals(BasePlayer.State.PLAY)){
            super.pause();
        }
        else throw new Exception("Unable to pause when state is : "+this.state);
    }

    @Override
    public void stop(){
        System.out.println("Audio stopped");
    }

    

}