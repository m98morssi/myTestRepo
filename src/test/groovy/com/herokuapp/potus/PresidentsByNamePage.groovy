package com.herokuapp.potus

import geb.Page

class PresidentsByNamePage extends Page {

    static searchField = 'input[id="q"]'
    static searchBtn = 'button[id="search-btn"]'
    static presidentsList = "strong"
    static url = '/search-by-name'

    static at = {
        title == 'Search for president by name'
    }

    static content = {

    }


}
