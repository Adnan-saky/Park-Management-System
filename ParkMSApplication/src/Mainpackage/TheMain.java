package Mainpackage;

public class TheMain {

    public static void main(String args[]) {
        //Creating object of LoadingScreen class. By this, only loading screen will appear
        LoadingScreen ob = new LoadingScreen();
        ob.setVisible(true);

        //Thread class may through any exception
        try {
            //This is called to keep the loading screen for 12000 millisecond or 12 second
            Thread.sleep(3500);  //default 12000
            ob.startApp();

        } catch (InterruptedException e) {
        }
    }
}
