package task2;

 class Player implements Playable, Recodable{
     @Override
     public void record() {
         System.out.println("Record music");
     }

     @Override
     public void play() {
         System.out.println("Play music");
     }

     @Override
     public void pause() {
         System.out.println("Pause music");
     }

     @Override
     public void stop() {
         System.out.println("Stop music");
     }
 }
