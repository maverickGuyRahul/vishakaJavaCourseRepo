package needForInterfaces;

interface Computer {
    void runTheCode(); // all the methods inside an interface are 'abstract' by default.

    int RAM_IN_GB = 25; // Variables inside interfaces are 'final static' By default
}

interface MP3Player {
    void playOrPauseMusic();
}

// An interface can extend more than one interfaces.

interface MusicPlayer extends MP3Player, Computer {
    void playMusic();
}

class Laptop implements Computer, MusicPlayer {
    public void runTheCode() {
        System.out.println("code, compile & run if all OK !!!");
    }

    public void playMusic() {
        System.out.println("playing music.......");
    }

    @Override
    public void playOrPauseMusic() {
        System.out.println("play - one click, pause - two clicks");
    }
}

class Desktop implements Computer {
    public void runTheCode() {
        System.out.println("code, compile & run if all OK, BUT FASTERRRRR !!!");
    }
}

class Developer {
    public void developApp(Computer obj) {
        System.out.println("Developing an app....");
        obj.runTheCode();
        // Computer.RAM_IN_GB = 24; ----> you cannot do this !!
    }
}

public class Example1 {
    public static void main(String[] args) {
        Developer Rahul = new Developer();

        Laptop HPOmen15 = new Laptop();

        Desktop MyComputer = new Desktop();

        Rahul.developApp(MyComputer);
    }
}
