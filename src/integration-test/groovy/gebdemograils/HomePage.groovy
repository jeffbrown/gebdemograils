package gebdemograils

import geb.Page

class HomePage extends Page {

    static url = '/'

    static at = {
        title == 'Welcome to Grails'
    }

    static content = {
        grailsLogo { $('a.navbar-brand img') }
    }

    String getLogoTooltip() {
        grailsLogo.@title
    }
}
