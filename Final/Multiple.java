package Final;

// Interface 1: The Contract for anything that takes photos
interface Camera {
    void takePhoto();

    void recordVideo();
}

// Interface 2: The Contract for anything that plays media
interface MusicPlayer {
    void playMusic(String songName);

    void pause();
}

// Interface 3: The Contract for anything that browses the web
interface WebBrowser {
    void browse(String url);
}

// The Child Class: SmartPhone
// It "implements" (agrees to fulfill) ALL these contracts
class SmartPhone implements Camera, MusicPlayer, WebBrowser {

    // 1. Implementing Camera logic
    public void takePhoto() {
        System.out.println("📸 Shutter clicked! Photo saved to Gallery.");
    }

    public void recordVideo() {
        System.out.println("🎥 Recording 4K video...");
    }

    // 2. Implementing MusicPlayer logic
    public void playMusic(String songName) {
        System.out.println("🎵 Playing: " + songName + " on Spotify.");
    }

    public void pause() {
        System.out.println("II Music Paused.");
    }

    // 3. Implementing WebBrowser logic
    public void browse(String url) {
        System.out.println("🌐 Navigating to " + url);
    }
}

public class Multiple {

    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();

        myPhone.takePhoto();
        myPhone.playMusic("Shape of You");
        myPhone.browse("google.com");
    }

}
