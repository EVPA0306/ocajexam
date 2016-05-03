package com.evpa.ocajexam.exercises.chaptereleven;

@FunctionalInterface
public interface Sequenceable<T> {
    public void sequence (T t);
    //public boolean test (T t);
}