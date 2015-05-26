package com.herokuapp.potus

import geb.Page

class PresidentialPartiesPage extends Page {
    static url = '/parties'

    static at = {
        title == 'Presidential Parties'
    }

    static content = {

    }
}
