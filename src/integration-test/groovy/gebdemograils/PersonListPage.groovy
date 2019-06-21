package gebdemograils

import geb.Page

class PersonListPage extends Page {

    static url = '/people'

    static at = {
        title == 'Person List'
    }

    static content = {
        csvLink { $('a#csv-link') }
        peopleRows {
            $('table tbody tr').moduleList PersonRow
        }
        firstNameLink {firstName -> $('a', text: firstName) }
    }

    int getNumberOfPeople() {
        peopleRows.size()
    }

    void clickFirstName(String name) {
        firstNameLink(name).click()
    }
}
