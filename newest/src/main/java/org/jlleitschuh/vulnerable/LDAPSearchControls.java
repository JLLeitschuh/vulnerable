package org.jlleitschuh.vulnerable;

import javax.naming.directory.SearchControls;

public class LDAPSearchControls {
    public static final SearchControls vulnerable = new SearchControls(0, 0, 0, null, true, false);
    public static final SearchControls nonVulnerable = new SearchControls(0, 0, 0, null, false, false);
}
