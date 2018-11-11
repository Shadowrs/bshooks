/*
 * Decompiled with CFR 0_125.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.concurrent.atomic.AtomicReference
 */
package com.imagineps.client;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class Stopwatch {
    private long time = Stopwatch.currentTime();
    private long startTime = Stopwatch.currentTime();

    public static long currentTime() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public long elapsed() {
        return Stopwatch.currentTime() - this.time;
    }

    public long elapsed(TimeUnit unit) {
        if (unit != TimeUnit.MILLISECONDS) return unit.convert(this.elapsed(), TimeUnit.MILLISECONDS);
        throw new IllegalArgumentException("Time is already in milliseconds!");
    }

    public boolean elapsed(long time) {
        if (this.elapsed() < time) return false;
        return true;
    }

    public Stopwatch reset() {
        this.startTime = this.time = Stopwatch.currentTime();
        return this;
    }

    public Stopwatch reset(long start) {
        this.time = Stopwatch.currentTime() + start;
        return this;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String toString() {
        return String.format((String)"STOPWATCH[time=%s, elapsed=%s]", (Object[])new Object[]{this.time, this.elapsed()});
    }

    public boolean hasElapsed(long time, TimeUnit unit) {
        if (this.elapsed() < TimeUnit.MILLISECONDS.convert(time, unit)) return false;
        return true;
    }

    public static final class AtomicStopwatch {
        private final AtomicLong cachedTime = new AtomicLong(Stopwatch.currentTime());
        private final AtomicReference<State> state = new AtomicReference((Object)State.STOPPED);

        public String toString() {
            boolean stopped;
            long l;
            boolean bl = stopped = this.state.get() == State.STOPPED;
            if (stopped) {
                l = 0L;
                return "STOPWATCH[elasped= " + l + "]";
            }
            l = this.elapsedTime();
            return "STOPWATCH[elasped= " + l + "]";
        }

        public static long currentTime() {
            return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
        }

        public AtomicStopwatch reset() {
            this.cachedTime.set(Stopwatch.currentTime());
            this.state.set((Object)State.RUNNING);
            return this;
        }

        public AtomicStopwatch stop() {
            this.state.set((Object)State.STOPPED);
            return this;
        }

        public long elapsedTime(TimeUnit unit) {
            if (this.state.get() != State.STOPPED) return unit.convert(Stopwatch.currentTime() - this.cachedTime.get(), TimeUnit.MILLISECONDS);
            throw new IllegalStateException("The timer has been stopped!");
        }

        public long elapsedTime() {
            return this.elapsedTime(TimeUnit.MILLISECONDS);
        }

        public boolean elapsed(long time, TimeUnit unit) {
            if (this.state.get() == State.STOPPED) {
                return true;
            }
            if (this.elapsedTime(unit) < time) return false;
            return true;
        }

        public boolean elapsed(long time) {
            return this.elapsed(time, TimeUnit.MILLISECONDS);
        }

        public boolean isStopped() {
            if (this.state.get() != State.STOPPED) return false;
            return true;
        }
    }

    private static enum State {
        RUNNING,
        STOPPED;
        

        private State() {
        }
    }

}

