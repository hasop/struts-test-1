package cchantep.services;

import cchantep.Badge;

/**
 * Definition of security/authentication service facade (see SOA).
 *
 * @author Cedric Chantepie
 * @typeparam B Concrete type for user badge
 */
public interface SecurityService<B extends Badge> {

    /**
     * Returns badge for given credentials.
     *
     * @param username Login/name of user
     * @param password Clear-text password
     * @return Badge if credentials are authenticated, or null
     */
    public B login(String username, String password);

} // end of interface SecurityService
