/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.io.BufferedInputStream
 *  java.io.ByteArrayInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  javax.sound.midi.InvalidMidiDataException
 *  javax.sound.midi.MidiSystem
 *  javax.sound.midi.MidiUnavailableException
 *  javax.sound.midi.Sequence
 *  javax.sound.midi.Sequencer
 */
package com.imagineps.client;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class SoundProvider {
    public Sequencer midiSequencer;
    private Sequence midiSequence;
    private static SoundProvider instance = null;

    protected SoundProvider() {
        try {
            this.midiSequencer = MidiSystem.getSequencer();
            return;
        }
        catch (MidiUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static SoundProvider getSingleton() {
        instance = instance != null ? instance : new SoundProvider();
        return instance;
    }

    public void playMIDI(byte[] data) {
        if (!this.midiSequencer.isOpen()) {
            try {
                this.midiSequencer.open();
            }
            catch (MidiUnavailableException midiUnavailableException) {
                // empty catch block
            }
        }
        if (this.midiSequencer.isRunning()) {
            this.midiSequencer.stop();
        }
        try {
            this.midiSequence = MidiSystem.getSequence((InputStream)new BufferedInputStream((InputStream)new ByteArrayInputStream(data)));
            this.midiSequencer.setLoopCount(-1);
            this.midiSequencer.setSequence(this.midiSequence);
        }
        catch (InvalidMidiDataException invalidMidiDataException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.midiSequencer.start();
    }

    public void stopMIDI() {
        this.midiSequencer.stop();
    }
}

