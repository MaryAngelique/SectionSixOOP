package com.timbuchalka;

public class ChallengeObject {

    private static native void registerNatives();

    static {
        registerNatives();
    }
}
