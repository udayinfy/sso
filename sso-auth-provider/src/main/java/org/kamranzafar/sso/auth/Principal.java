package org.kamranzafar.sso.auth;

import java.io.Serializable;

/**
 * Created by kamran on 12/08/15.
 */
public interface Principal extends Serializable {
    String getName();
}
