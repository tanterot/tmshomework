package impl;

import interf.Voice;

public class Dog implements Voice {
    @Override
    public void doVoice() {
        System.out.println("Gav");
    }
}
