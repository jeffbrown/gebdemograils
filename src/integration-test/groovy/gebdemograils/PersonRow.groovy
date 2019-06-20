package gebdemograils

import geb.Module

class PersonRow extends Module {
    static content = {
        cell { $('td', it) }
        firstName { cell(0).$('a').text() }
        lastName { cell(1).text() }
    }
}
