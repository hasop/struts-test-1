package cchantep.services;

/**
 * Mockup implementation for security service.
 *
 * @author Cedric Chantepie
 */
public final class MockupSecurityService 
    implements SecurityService<MockupSecurityService.Badge> {

    /**
     * {@inheritDoc}
     */
    public Badge login(final String username, final String password) {
        return ("lorem".equals(username) && 
                "ipsum".equals(password)) 
            ? new Badge(username)
            : null;

    } // end of login

    // --- Inner classes ---

    /**
     * Mockup badge (immutable) implementation.
     */
    public final class Badge implements cchantep.Badge {
        // --- Properties ---

        /**
         * User name
         */
        private final String username;

        // --- Constructors ---

        /**
         * Bulk constructor.
         */
        public Badge(final String username) {
            if (username == null || username.trim().length() == 0) {
                throw new IllegalArgumentException("Empty username");
            } // end of if

            this.username = username;
        } // end of <init>

        // ---

        /**
         * {@inheritDoc}
         */
        public String getUsername() {
            return this.username;
        } // end of getUsername
    } // end of class Badge
} // end of class MockupSecurityService
