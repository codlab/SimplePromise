package eu.codlab.simplepromise.solve;

import eu.codlab.simplepromise.Promise;

public interface ThenPromise<ENTRY, TYPE> extends PromiseLikeGeneric<ENTRY, Promise<TYPE>> {
}
