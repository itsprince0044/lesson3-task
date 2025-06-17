abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() { System.out.println("Playing piano melody"); }
}

class Guitar extends Instrument {
    void playSound() { System.out.println("Strumming guitar chords"); }
}

class Violin extends Instrument {
    void playSound() { System.out.println("Playing violin tune"); }
}

