package com.djamware

class Player {

    static belongsTo = [item: Team]
    String name
    Integer age
    String position

    static constraints = {

        name size: 5..40, blank: false
        age min: 16
        position size: 5..40, blank: false
    }

    Strings toString () {
        name
    }
}
