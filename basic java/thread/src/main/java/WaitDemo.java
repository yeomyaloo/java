//use of wait() method
class GunFight {
    private int bullets = 40;

    synchronized public void fire(int bulletsToBeFired){
        for (int i = 1; i<=bulletsToBeFired; i++){
            if (bullets == 0){
                System.out.println(i-1 +" bullets fired and "+bullets+" remains");
                System.out.println("Invoking the wait() method");

                try{
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Continuing the fire after reloading");
            }
            bullets--;
        }
        System.out.println("The firing process is complet");
    }
    // notify(), notifyAll()는 호출하면 wait()를 사용한 쓰레드를 wakes up 시킨다.
    synchronized public void reload(){
        System.out.println("Reloading the magazine and resumeing "+
                "the thread using notify()" );
        bullets += 40;
        notify();
    }
}

public class WaitDemo extends Thread{
    public static void main(String[] args) {
        GunFight gf = new GunFight();

        //새로운 thread 호출
        new Thread() {
            @Override
            public void run() {
                gf.fire(60);
            }
        }.start();


    }
}
