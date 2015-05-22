package com.herokuapp.potus

import geb.Module

class NavigationModule extends Module {
  static content = {
    home { $('a[href="/"]') }
    presidentsByYear { $('a[href="/search-by-year"]') }
    presidentsByName { $('a[href="/search-by-name"]') }
    presidentialParties { $('a[href="/parties"]') }
  }
}
