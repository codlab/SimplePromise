package eu.codlab.simplepromise.solve;

public interface PromiseLikeGeneric<ENTRY, T> {

    T call(ENTRY entry);
}
